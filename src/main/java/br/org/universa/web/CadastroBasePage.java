package br.org.universa.web;


import java.util.Arrays;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

import br.org.universa.negocio.CadastroBase;

/**
 * Cadastro cliente
 */
public class CadastroBasePage extends WebPage {

	private static final long serialVersionUID = 1L;
	private CadastroBase cadastroBase = new CadastroBase();
	private List<String> categorias = Arrays.asList(new String[]{"SOFTWARE", "HARDWARE"});

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
	@SuppressWarnings("serial")
	public CadastroBasePage(final PageParameters parameters) {

/*		Form<Object> form = new Form<Object>("form");
		add(form);

		form.add(new TextField<Integer>("codigo", new PropertyModel<Integer>(this, "cliente.codigo")));
		form.add(new TextField<String>("nome", new PropertyModel<String>(this, "cliente.nome")));
		form.add(new TextField<String>("endereco", new PropertyModel<String>(this, "cliente.endereco")));
		form.add(new TextField<String>("telefone", new PropertyModel<String>(this, "cliente.telefone")));

		form.add(new Button("btnConfirmar") {
			public void onSubmit() {
		       System.out.println(cliente);
		       setResponsePage(CadastroClienteRespostaPage.class);
			}
		}
		);
		
		form.add(new Button("btnCancelar") {
			public void onSubmit() {

			}
		});*/
		
     	Form<Object> form = new Form<Object>("form");
    	form.add(new TextField<String>("titulo", new PropertyModel<String>(this,"cadastroBase.titulo")));
    	
    	DropDownChoice<String> choice=new DropDownChoice<String>("categoria", new PropertyModel<String>(this, "cadastroBase.categoria"), categorias);
    	form.add(choice);
    	
    	form.add(new TextField<String>("nome", new PropertyModel<String>(this,"cadastroBase.nome")));
    	form.add(new TextField<String>("versao", new PropertyModel<String>(this,"cadastroBase.versao")));
    	
    	form.add(new Button("cadastra") {
    		@Override
    		public void onSubmit() {
    			// TODO Auto-generated method stub
    			super.onSubmit();
    		}
    		
    	});
    	
    	add(form);
	}

}