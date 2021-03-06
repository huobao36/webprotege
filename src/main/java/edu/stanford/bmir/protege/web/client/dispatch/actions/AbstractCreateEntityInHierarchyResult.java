package edu.stanford.bmir.protege.web.client.dispatch.actions;

import edu.stanford.bmir.protege.web.shared.event.ProjectEvent;
import edu.stanford.bmir.protege.web.shared.events.EventList;
import edu.stanford.bmir.protege.web.shared.project.ProjectId;
import org.semanticweb.owlapi.model.OWLEntity;

import java.util.Map;
import java.util.Optional;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 25/03/2013
 */
public abstract class AbstractCreateEntityInHierarchyResult<E extends OWLEntity> extends AbstractCreateEntityResult<E> {

    private E parent;

    /**
     * For serialization purposes only!
     */
    protected AbstractCreateEntityInHierarchyResult() {
    }

    public AbstractCreateEntityInHierarchyResult(Map<E, String> entity2BrowserTextMap, ProjectId projectId, Optional<E> parent, EventList<ProjectEvent<?>> eventList) {
        super(entity2BrowserTextMap, projectId, eventList);
        this.parent = parent.orElse(null);
    }

    public java.util.Optional<E> getParent() {
        return java.util.Optional.ofNullable(parent);
    }
}
