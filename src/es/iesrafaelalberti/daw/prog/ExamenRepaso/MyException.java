package es.iesrafaelalberti.daw.prog.ExamenRepaso;

public class MyException extends Exception{

    private String codigo;

    public MyException(String codigo) {
        super();
        this.codigo = codigo;
    }

    @Override
    public String getMessage(){
        String message = "";
        switch (codigo){
            case "1":
                message = "La coordenada x no puede ser mayor que 800 ni menor que 0";
                break;

            case "2":
                message = "La coordenada y no puede ser mayor que 600 ni menor que 0";
                break;

            case "3":
                message = "Error, el circulo esta fuera de la pantalla";

            case "4":
                message = "El valor introducido no puede ser menor que 0";
                break;

            case "5":
                message = "Error, el rectangulo esta fuera de la pantalla";


        }
        return message;
    }


}
