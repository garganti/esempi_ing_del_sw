package applicazione_vaadin_nosb;



import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("/form")@PageTitle("INSERIMENTO DATI")
public class FormView extends VerticalLayout{
	
	public FormView(){
		TextField txtField = new TextField("TESTO");
		Button btn = new Button("BOTTONE");
		Span greettings = new Span("SALUTI");
		btn.addClickListener( 
				e -> greettings.setText("ALURA " + txtField.getValue()));
		DateTimePicker dateTimePicker = new DateTimePicker();
		dateTimePicker.setLabel("Meeting date and time");
		add(txtField);
		add(btn);
		add(greettings);
		add(dateTimePicker);
	}

}
