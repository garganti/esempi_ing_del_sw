package applicazione_vaadin_nosb;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message on a new line.
 */
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        // Use TextField for standard text input
        TextField nameField = new TextField("Your name");
        nameField.addClassName("bordered");
        // Button click listeners can be defined as lambda expressions
        GreetService greetService = new GreetService();
        Button button = new Button("Say hello", e -> {
            add(new Paragraph(greetService.greet(nameField.getValue())));
        });

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in
        // styles.css.
        addClassName("centered-content");

        
        var greeting = new Span(); 
        add(greeting);
        add(new Button("Say Hello", event ->
            greeting.setText("Hello, %s!".formatted(nameField.getValue())) 
        ));

        
        add(nameField, button);
    }
}
