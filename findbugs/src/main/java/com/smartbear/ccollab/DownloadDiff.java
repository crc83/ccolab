package com.smartbear.ccollab;

import com.google.common.io.Files;
import com.smartbear.ccollab.service.api.v7001.CodeCollaborator;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author mamontov
 */
public class DownloadDiff {

    public static void main(String[] args) throws Exception {

        // So, let's authenticate:
        String username = args[0];
        String password = args[1];

        // Request an implementation of the interface CodeCollaborator from CXF:
        JaxWsProxyFactoryBean clientFactory = new JaxWsProxyFactoryBean();
        clientFactory.setServiceClass(CodeCollaborator.class);
        // Point to your server, obviously. :)
        clientFactory.setAddress("http://11.120.102.48/services/CodeCollaborator_7001");
        CodeCollaborator client = (CodeCollaborator) clientFactory.create();
        // Code Collaborator uses ticket-based authentication so that you don't have
        // to send username/pass w/ every request.
        // More savvy clients should SAVE the login ticket (not the password)
        // and re-use it across invocations .
        // Here, we just call getLoginTicket() every time ShowActionItems is run.
        String ticket = client.getLoginTicket(username, password);
        if (ticket == null) {
            System.out.println("Username/password incorrect.");
            return;
        }

        final File rootDir = Files.createTempDir();
        com.smartbear.ccollab.rs.Files sf = JAXRSClientFactory.create("http://11.120.102.48", com.smartbear.ccollab.rs.Files.class);

        com.smartbear.ccollab.rs.Diff diff = JAXRSClientFactory.create("http://11.120.102.48", com.smartbear.ccollab.rs.Diff.class);
        String value = diff.getDiff(username, ticket, 653);
        System.out.println("value = " + value);


        final byte[] bytes = sf.downloadFiles(username, ticket, 653, "latest");
        final File to = new File(rootDir, "files.zip");
        Files.write(bytes, to);

        unZipIt(to, rootDir);
        System.out.println(bytes);
    }

    /**
     * Unzip it
     *
     * @param zipFile      input zip file
     * @param outputFolder zip file output folder
     */
    public static void unZipIt(File zipFile, File outputFolder) throws IOException {

        byte[] buffer = new byte[1024];

        //get the zip file content
        ZipInputStream zis =
                new ZipInputStream(new FileInputStream(zipFile));
        //get the zipped file list entry
        ZipEntry ze = zis.getNextEntry();

        while (ze != null) {

            String fileName = ze.getName();
            File newFile = new File(outputFolder + File.separator + fileName);

            System.out.println("file unzip : " + newFile.getAbsoluteFile());

            //create all non exists folders
            //else you will hit FileNotFoundException for compressed folder
            new File(newFile.getParent()).mkdirs();

            FileOutputStream fos = new FileOutputStream(newFile);

            int len;
            while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }

            fos.close();
            ze = zis.getNextEntry();
        }

        zis.closeEntry();
        zis.close();
    }
}
