package ejercicio5;

public class ConversorHora {
    public String calcularHora(int segundos){
        int horas = 0, minutos = 0;
        String ret = "";
        horas = segundos / 3600;
        segundos -= horas * 3600;
        if(segundos > 0){
            minutos = segundos / 60;
            segundos -= minutos * 60;
        }
        if(horas < 10){
            ret += "0"+String.valueOf(horas);
        } else {
            ret += String.valueOf(horas);
        }
        if(minutos < 10){
            ret += ":0"+String.valueOf(minutos);
        } else {
            ret += ":"+String.valueOf(minutos);
        }
        if(segundos < 10){
            ret += ":0"+String.valueOf(segundos);
        } else {
            ret += ":"+String.valueOf(segundos);
        }
        return ret;
    }
}
