package com.smartbear.ccollab.service.api.v7001;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-09-20T15:21:45.792+04:00
 * Generated source version: 2.6.2
 */
public final class CodeCollaborator_CollabSoap7001Port_Client {

    private static final QName SERVICE_NAME = new QName("http://v7001.api.service.ccollab.smartbear.com/", "CollabSoap7001Service");

    private CodeCollaborator_CollabSoap7001Port_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CollabSoap7001Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        CollabSoap7001Service ss = new CollabSoap7001Service(wsdlURL, SERVICE_NAME);
        CodeCollaborator port = ss.getCollabSoap7001Port();

        {
            System.out.println("Invoking uncancelReview...");
            int _uncancelReview_reviewID = 0;
            try {
                port.uncancelReview(_uncancelReview_reviewID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking markDefectExternal...");
            int _markDefectExternal_arg0 = 0;
            java.lang.String _markDefectExternal_arg1 = "";
            try {
                port.markDefectExternal(_markDefectExternal_arg0, _markDefectExternal_arg1);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking getActionItems...");
            try {
                java.util.List<com.smartbear.ccollab.service.api.v7001.ActionItem> _getActionItems__return = port.getActionItems();
                System.out.println("getActionItems.result=" + _getActionItems__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking createComment...");
            int _createComment_reviewID = 0;
            java.lang.String _createComment_comment = "";
            try {
                int _createComment__return = port.createComment(_createComment_reviewID, _createComment_comment);
                System.out.println("createComment.result=" + _createComment__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking acceptAt...");
            com.smartbear.ccollab.service.api.v7001.Location _acceptAt_location = null;
            try {
                port.acceptAt(_acceptAt_location);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking checkLoginTicket...");
            try {
                boolean _checkLoginTicket__return = port.checkLoginTicket();
                System.out.println("checkLoginTicket.result=" + _checkLoginTicket__return);

            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking acceptConversation...");
            int _acceptConversation_conversationID = 0;
            try {
                port.acceptConversation(_acceptConversation_conversationID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking deleteDefect...");
            int _deleteDefect_arg0 = 0;
            try {
                port.deleteDefect(_deleteDefect_arg0);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking reopenReview...");
            int _reopenReview_reviewID = 0;
            try {
                port.reopenReview(_reopenReview_reviewID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking getLoginTicket...");
            java.lang.String _getLoginTicket_login = "";
            java.lang.String _getLoginTicket_password = "";
            try {
                java.lang.String _getLoginTicket__return = port.getLoginTicket(_getLoginTicket_login, _getLoginTicket_password);
                System.out.println("getLoginTicket.result=" + _getLoginTicket__return);

            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking cancelReview...");
            int _cancelReview_reviewID = 0;
            try {
                port.cancelReview(_cancelReview_reviewID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking getCurrentUser...");
            try {
                com.smartbear.ccollab.service.api.v7001.User _getCurrentUser__return = port.getCurrentUser();
                System.out.println("getCurrentUser.result=" + _getCurrentUser__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking createCommentAt...");
            com.smartbear.ccollab.service.api.v7001.Location _createCommentAt_location = null;
            java.lang.String _createCommentAt_comment = "";
            try {
                int _createCommentAt__return = port.createCommentAt(_createCommentAt_location, _createCommentAt_comment);
                System.out.println("createCommentAt.result=" + _createCommentAt__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking markConversationRead...");
            int _markConversationRead_conversationID = 0;
            try {
                port.markConversationRead(_markConversationRead_conversationID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking createDefect...");
            int _createDefect_reviewID = 0;
            java.lang.String _createDefect_comment = "";
            java.util.List<com.smartbear.ccollab.service.api.v7001.CustomField> _createDefect_customField = null;
            try {
                int _createDefect__return = port.createDefect(_createDefect_reviewID, _createDefect_comment, _createDefect_customField);
                System.out.println("createDefect.result=" + _createDefect__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking getProductVersion...");
            java.lang.String _getProductVersion__return = port.getProductVersion();
            System.out.println("getProductVersion.result=" + _getProductVersion__return);


        }
        {
            System.out.println("Invoking markDefectOpen...");
            int _markDefectOpen_arg0 = 0;
            try {
                port.markDefectOpen(_markDefectOpen_arg0);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking waitReview...");
            int _waitReview_reviewID = 0;
            com.smartbear.ccollab.service.api.v7001.ActivityTypeSpec _waitReview_waitingUntil = null;
            try {
                port.waitReview(_waitReview_reviewID, _waitReview_waitingUntil);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking rejectReview...");
            int _rejectReview_reviewID = 0;
            java.lang.String _rejectReview_reason = "";
            try {
                port.rejectReview(_rejectReview_reviewID, _rejectReview_reason);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking updateDefect...");
            int _updateDefect_defectID = 0;
            java.lang.String _updateDefect_comment = "";
            java.util.List<com.smartbear.ccollab.service.api.v7001.CustomField> _updateDefect_customField = null;
            try {
                port.updateDefect(_updateDefect_defectID, _updateDefect_comment, _updateDefect_customField);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking setAnnotation...");
            int _setAnnotation_reviewID = 0;
            int _setAnnotation_versionID = 0;
            java.lang.String _setAnnotation_comment = "";
            try {
                port.setAnnotation(_setAnnotation_reviewID, _setAnnotation_versionID, _setAnnotation_comment);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking updateReview...");
            int _updateReview_reviewID = 0;
            java.lang.String _updateReview_title = "";
            java.lang.String _updateReview_groupGuid = "";
            javax.xml.datatype.XMLGregorianCalendar _updateReview_deadline = null;
            com.smartbear.ccollab.service.api.v7001.DisplayChangeListAsSpec _updateReview_displayChangeListAs = null;
            com.smartbear.ccollab.service.api.v7001.ReviewAccessSpec _updateReview_accessibleBy = null;
            java.lang.String _updateReview_templateName = "";
            try {
                port.updateReview(_updateReview_reviewID, _updateReview_title, _updateReview_groupGuid, _updateReview_deadline, _updateReview_displayChangeListAs, _updateReview_accessibleBy, _updateReview_templateName);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking finishReviewPhase...");
            int _finishReviewPhase_reviewID = 0;
            com.smartbear.ccollab.service.api.v7001.ActivityTypeSpec _finishReviewPhase_finishedUntil = null;
            try {
                port.finishReviewPhase(_finishReviewPhase_reviewID, _finishReviewPhase_finishedUntil);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking createReview...");
            java.lang.String _createReview_userlogin = "";
            try {
                int _createReview__return = port.createReview(_createReview_userlogin);
                System.out.println("createReview.result=" + _createReview__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking findLatestVersion...");
            int _findLatestVersion_reviewID = 0;
            java.lang.String _findLatestVersion_filePath = "";
            try {
                int _findLatestVersion__return = port.findLatestVersion(_findLatestVersion_reviewID, _findLatestVersion_filePath);
                System.out.println("findLatestVersion.result=" + _findLatestVersion__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking redactComment...");
            int _redactComment_commentID = 0;
            try {
                port.redactComment(_redactComment_commentID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking pokeReviewParticipant...");
            int _pokeReviewParticipant_reviewID = 0;
            java.lang.String _pokeReviewParticipant_participantLogin = "";
            try {
                port.pokeReviewParticipant(_pokeReviewParticipant_reviewID, _pokeReviewParticipant_participantLogin);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking accept...");
            int _accept_reviewID = 0;
            try {
                port.accept(_accept_reviewID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking updateReviewCustomFields...");
            int _updateReviewCustomFields_reviewID = 0;
            java.util.List<com.smartbear.ccollab.service.api.v7001.CustomField> _updateReviewCustomFields_customField = null;
            try {
                port.updateReviewCustomFields(_updateReviewCustomFields_reviewID, _updateReviewCustomFields_customField);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking markDefectNotExternal...");
            int _markDefectNotExternal_arg0 = 0;
            try {
                port.markDefectNotExternal(_markDefectNotExternal_arg0);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking deleteReview...");
            int _deleteReview_reviewID = 0;
            try {
                port.deleteReview(_deleteReview_reviewID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking startAnnotatingPhase...");
            int _startAnnotatingPhase_reviewID = 0;
            try {
                port.startAnnotatingPhase(_startAnnotatingPhase_reviewID);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking markDefectFixed...");
            int _markDefectFixed_arg0 = 0;
            try {
                port.markDefectFixed(_markDefectFixed_arg0);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking addReviewURLs...");
            int _addReviewURLs_reviewID = 0;
            java.util.List<java.lang.String> _addReviewURLs_url = null;
            java.lang.String _addReviewURLs_uploadComment = "";
            try {
                port.addReviewURLs(_addReviewURLs_reviewID, _addReviewURLs_url, _addReviewURLs_uploadComment);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking createDefectAt...");
            com.smartbear.ccollab.service.api.v7001.Location _createDefectAt_location = null;
            java.lang.String _createDefectAt_comment = "";
            java.util.List<com.smartbear.ccollab.service.api.v7001.CustomField> _createDefectAt_customField = null;
            try {
                int _createDefectAt__return = port.createDefectAt(_createDefectAt_location, _createDefectAt_comment, _createDefectAt_customField);
                System.out.println("createDefectAt.result=" + _createDefectAt__return);

            } catch (NotAuthorizedException_Exception e) {
                System.out.println("Expected exception: NotAuthorizedException has occurred.");
                System.out.println(e.toString());
            } catch (ServerNotInitializedException_Exception e) {
                System.out.println("Expected exception: ServerNotInitializedException has occurred.");
                System.out.println(e.toString());
            } catch (ServiceException_Exception e) {
                System.out.println("Expected exception: ServiceException has occurred.");
                System.out.println(e.toString());
            }
        }

        System.exit(0);
    }

}