package edu.stanford.bmir.protege.web.shared.frame;

import edu.stanford.bmir.protege.web.shared.entity.OWLClassData;
import edu.stanford.bmir.protege.web.shared.entity.OWLObjectPropertyData;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 21/11/2012
 */
public final class PropertyClassValue extends ObjectPropertyValue implements ClassFramePropertyValue {

    private PropertyClassValue() {
    }

    public PropertyClassValue(OWLObjectPropertyData property, OWLClassData value, State state) {
        super(property, value, state);
    }

    @Override
    public OWLClassData getValue() {
        return (OWLClassData) super.getValue();
    }

    @Override
    public boolean isValueMostSpecific() {
        return false;
    }

    @Override
    public <R, E extends Throwable> R accept(PropertyValueVisitor<R, E> visitor) throws E {
        return visitor.visit(this);
    }

    @Override
    public boolean isAnnotation() {
        return false;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public int hashCode() {
        return "PropertyClassValue".hashCode()  + getProperty().hashCode() + getValue().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof PropertyClassValue)) {
            return false;
        }
        PropertyClassValue other = (PropertyClassValue) obj;
        return this.getProperty().equals(other.getProperty()) && this.getValue().equals(other.getValue());
    }

    @Override
    protected PropertyValue duplicateWithState(State state) {
        return new PropertyClassValue(getProperty(), getValue(), state);
    }
}
