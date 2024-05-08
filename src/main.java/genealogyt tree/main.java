package genealogyt tree;

import genealogyt tree.model.GenealogicalTree;
import genealogyt tree.model.Person;
import genealogyt tree.presenter.GenealogicalTreePresenter;
import genealogyt tree.view.GenealogicalTreeView;

public class Main {

    public static void main(String[] args) {
      
        GenealogicalTree model = new GenealogicalTree();

        GenealogicalTreeView view = new GenealogicalTreeViewImpl();

        GenealogicalTreePresenter presenter = new GenealogicalTreePresenter(model, view);

        presenter.loadPeople();

        presenter.sortByName();
    }
}
