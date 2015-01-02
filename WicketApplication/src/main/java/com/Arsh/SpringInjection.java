package com.Arsh;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class SpringInjection extends WebPage {

	@SpringBean
	private EmpDAOImpl dao;
	Employee emp = new Employee();
	List<Employee> emplst = new ArrayList<Employee>();
	private DataView<Employee> popolate;

	// private UserModel uSerModel;
	public SpringInjection() {
		setDefaultModel(new CompoundPropertyModel<Employee>(emp));
		emplst = dao.getEmployee();
		Employee da = emplst.get(0);
		System.out.println(da.getEmpName());
		System.out.println(da.getEmpNO());
		Form form = new Form("springForm") {
			@Override
			protected void onSubmit() {
				super.onSubmit();
				System.out.println(emp.getUser());
				System.out.println(emp.getPass());
			}
		};
		popolate = new DataView("simple", new ListDataProvider(
				emplst)) {
            public void populateItem(final Item item) {
                final Employee user = (Employee) item.getModelObject();
                item.add(new Label("id", user.getEmpName()));
            }
        };
		
		// final TextField<String> user=new TextField<String>("username",new
		// PropertyModel<String>(emp, "user"));
		// final PasswordTextField pass=new PasswordTextField("passwd",new
		// PropertyModel<String>(emp, "pass"));
		form.add(new TextField<String>("user"));
		form.add(new PasswordTextField("pass"));
		form.add(new Label("empname", new PropertyModel<String>(da, "empName")));
		form.add(new Label("empid", new PropertyModel<String>(da, "empNO")));
		form.add(popolate);
		add(form);
	}
}
