package challenge;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import javax.swing.JOptionPane;

public class Password {
	/*
	Haz una clase llamada Password que siga las siguientes condiciones:
		● Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de
		8 caracteres.
		● Los constructores serán los siguiente:
		■ Un constructor por defecto.
		■ Un constructor con la longitud que nosotros le pasemos (Generará una
		contraseña aleatoria con esa longitud).
		● Los métodos que implementa serán:
		○ esFuerte(): devuelve un booleano si es fuerte o no, para que sea
		fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de
		3 números.
		○ generarPassword(): genera la contraseña del objeto con la longitud
		que tenga.
		○ Métodos get para los atributos contraseña y longitud.
		○ Método set para stributo longitud
	*/
	

	private String contrasenia;

	private int longitud=8;
	
	public Password() {
	}

	public Password(int longitud) {
		this.longitud=longitud;
		contrasenia=generarPassword();
	}
	

	public int getLongitud() {
		return longitud;

	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
		
	}
	
	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	/*
     * Genera una contraseña al azar con la longitud que este definida
     */
    public String generarPassword (){
        String password="";
        for (int i=0;i<longitud;i++){
            //genero un numero aleatorio, de acuerdo al numero que salga esta la opcion de a ñadir una minuscula, mayuscula o numero
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }
		
		
    public boolean esFuerte(){
        int cantNumeros=0;
        int cantMinusculas=0;
        int cantMayusculas=0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i=0;i<contrasenia.length();i++){
                if (contrasenia.charAt(i)>=97 && contrasenia.charAt(i)<=122){
                	cantMinusculas+=1;
                }else{
                    if (contrasenia.charAt(i)>=65 && contrasenia.charAt(i)<=90){
                    	cantMayusculas+=1;
                }else{
                	cantNumeros+=1;
                    }
                }
            }
            //Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
            if (cantNumeros>=5 && cantMinusculas>=1 && cantMayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
	
	
	public static void main(String[] args) {
		
		
		//tamaño del array y la longitud del password
        String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
        int longitud=Integer.parseInt(texto);
  
        //arrays
        Password listaContrasenia[]=new Password[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        //indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaContrasenia.length;i++){
            listaContrasenia[i]=new Password(longitud);
            fortalezaPassword[i]=listaContrasenia[i].esFuerte();
            System.out.println(listaContrasenia[i].getContrasenia()+" "+fortalezaPassword[i]);
        }
    }
		
	}


	


