package pet.projects.mvc;

import pet.projects.mvc.controller.Controller;
import pet.projects.mvc.model.MainModel;
import pet.projects.mvc.model.Model;
import pet.projects.mvc.view.EditUserView;
import pet.projects.mvc.view.UsersView;

public class Main {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("NewName", 126L, 73);
        usersView.fireEventShowDeletedUsers();
    }
}
