package contatti.vaadin;

import java.util.List;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import contatti.jooq.DataService;
import contatti.jooq.generated.tables.records.IndirizziRecord;

/**
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

    	Grid<IndirizziRecord> grid = new Grid<>(IndirizziRecord.class, false);
    	grid.addColumn(IndirizziRecord::getNome).setHeader("First name");
    	grid.addColumn(IndirizziRecord::getNumtelefono).setHeader("telefono");

    	List<IndirizziRecord> people = DataService.getIndirizziRecord();
    	grid.setItems(people);
//
//        // Use TextField for standard text input
//        TextField textField = new TextField("Your name");
//        textField.addThemeName("bordered");
//        // Button click listeners can be defined as lambda expressions
//        GreetService greetService = new GreetService();
//        Button button = new Button("Say hello", e -> Notification
//                .show(greetService.greet(textField.getValue())));
//
//        // Theme variants give you predefined extra styles for components.
//        // Example: Primary button is more prominent look.
//        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//
//        // You can specify keyboard shortcuts for buttons.
//        // Example: Pressing enter in this view clicks the Button.
//        button.addClickShortcut(Key.ENTER);
//
//        // Use custom CSS classes to apply styling. This is defined in
//        // shared-styles.css.
//        addClassName("centered-content");
//
//        add(textField, button);
    	add(grid);
    }
}
