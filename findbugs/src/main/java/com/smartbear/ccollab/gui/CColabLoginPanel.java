package com.smartbear.ccollab.gui;

import com.intellij.ui.DocumentAdapter;

import javax.swing.*;
import javax.swing.event.DocumentEvent;

public class CColabLoginPanel {
    private JTextField myLoginTextField;
    private JPasswordField myPasswordField;
    private JPanel myPane;
    private JTextField myHostTextField;

    public CColabLoginPanel(final CColabLoginDialog dialog) {
        myLoginTextField.getDocument().addDocumentListener(new DocumentAdapter() {
            @Override
            protected void textChanged(DocumentEvent e) {
                dialog.clearErrors();
            }
        });
        myPasswordField.getDocument().addDocumentListener(new DocumentAdapter() {
            @Override
            protected void textChanged(DocumentEvent e) {
                dialog.clearErrors();
            }
        });
    }

    public CColabLoginPanel() {
    }

    public JComponent getPanel() {
        return myPane;
    }

    public void setHost(final String host) {
        myHostTextField.setText(host);
    }

    public void setLogin(final String login) {
        myLoginTextField.setText(login);
    }

    public void setPassword(final String password) {
        myPasswordField.setText(password);
    }

    public String getHost() {
        return myHostTextField.getText().trim();
    }

    public String getLogin() {
        return myLoginTextField.getText().trim();
    }

    public String getPassword() {
        return String.valueOf(myPasswordField.getPassword());
    }

    public JComponent getPreferrableFocusComponent() {
        return myLoginTextField;
    }
}

