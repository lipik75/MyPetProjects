package pet.projects.mvc.view;

import pet.projects.mvc.controller.Controller;
import pet.projects.mvc.model.ModelData;

public interface View {
    void refresh(ModelData modelData);

    void setController(Controller controller);
}
