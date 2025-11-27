package controller;


import model.Model;
import view.View; 
public class Controller {
    Model model;
    View view;
    
    

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setController(this); //!!!!!!!!!!!
    }



    public void iniciar(){
        String option;
        do{
            view.mostrarMenu();
            option = view.leerOpcion();
            switch(option){
                case "1":
                    int n1 = view.leerNumero();
                    int n2 = view.leerNumero();
                    model.setN1(n1);
                    model.setN2(n2);
                    break;
                case "2":
                    model.calcSUm();
                    break;
                case "3":
                    view.mostarSuma();
                    break;
                case "q":
                    option = "q";
                    break;
            }
        }while(!option.equals("q"));
        
        
    }



    public String getSum() {
        return Integer.toString(model.getSum());
    }
    

    
}
