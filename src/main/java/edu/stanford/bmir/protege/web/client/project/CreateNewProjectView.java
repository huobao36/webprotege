package edu.stanford.bmir.protege.web.client.project;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import edu.stanford.bmir.protege.web.client.library.dlg.HasInitialFocusable;
import edu.stanford.bmir.protege.web.client.library.dlg.ValidationState;
import edu.stanford.bmir.protege.web.client.library.dlg.WebProtegeDialogForm;
import edu.stanford.bmir.protege.web.client.library.dlg.WebProtegeDialogValidator;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 18/01/2012
 */
public interface CreateNewProjectView extends HasInitialFocusable, IsWidget {

    /**
     * Gets the name of the new project.
     */
    @Nonnull
    String getProjectName();

    /**
     * Gets a description for the new project.
     */
    @Nonnull
    String getProjectDescription();

    /**
     * Specified whether the file upload section of the view should be enabled/visible.
     * @param enabled true if the file upload section should be enabled/visible, otherwise false.
     */
    void setFileUploadEnabled(boolean enabled);

    /**
     * Sets the URL that the upload should be posted to.  This is the URL that would be set in the "action" field
     * on an HTML form.
     * @param url The post URL.
     */
    void setFileUploadPostUrl(@Nonnull String url);

    /**
     * Determines whether a file (for upload) has been supplied.
     * @return true if a file has been supplied, otherwise false.
     */
    boolean isFileUploadSpecified();

    /**
     * Clears the information in the view.
     */
    void clear();

    /**
     * Sets a handler for when the form submission is complete.  The form submission is only relevant for file uploads.
     */
    void setSubmitCompleteHandler(@Nonnull FormPanel.SubmitCompleteHandler handler);

    /**
     * Asks the file upload form to submit the form data.
     */
    void submitFormData();
}
