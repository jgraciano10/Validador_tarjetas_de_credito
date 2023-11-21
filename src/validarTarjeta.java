import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class validarTarjeta {
    public static String validar(String number) {
        String[] arraynumbersString = number.split("");
        String numeroCodificado ="";

        switch (arraynumbersString.length) {
            case 16:
                // con este metodo convertimos a entero los valores, y se multiplican por dos los numeros almacenados en un sitio impar
                // si un numero impar despues de ser multiplicado por dos excede el numero 9, se le resta nueve y se le suma a la variable suma
                // los numeros que se guardan en un sitio par solo se suman  a la variable suma ArrayNumbersChanged despues de  convirtirlos a enteros
                int suma = 0;
                int contador = 1;

                for (String numero : arraynumbersString) {
                    int numeroInt = Integer.parseInt(numero);
                    if(contador>12){
                        numeroCodificado+=numero;
                    }else{
                        numeroCodificado+="*";
                    }
                    if (!(contador % 2 == 0)) {
                        numeroInt *= 2;
                        contador++;
                        if (numeroInt > 9) {
                            numeroInt -= 9;
                            suma += numeroInt;
                        } else {
                            suma += numeroInt;
                        }

                    } else {
                        suma += numeroInt;
                        contador++;
                    }
                }


                switch (suma % 10) {
                    case 0:
                        return "El numero " + numeroCodificado + " es valido";
                    default:
                        return "El numero " + numeroCodificado + " contiene 16 caracteres pero no es un numero valido";

                }


            default:
                return "Introduce un numero valido, los numeros de tarjetas contienen 16 caracteres";
        }

    }


}
