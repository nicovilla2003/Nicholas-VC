import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
public class narutoJutsu{
	public static void main(String[] args){
	int cont=JOptionPane.YES_OPTION;
	int[] jutsu={500,300,200};
	int opt=0;
	int sesEntren=0;
	int horas;
	while(cont==JOptionPane.YES_OPTION){
	
	
	sesEntren++;
	JOptionPane.showMessageDialog(null,"Esta es la sesion de entrenamiento: "+sesEntren);
	opt=Integer.parseInt(JOptionPane.showInputDialog("Para cual jutsu desea registrar horas(Escriba el numero de la opcion):\n1. Ninjutsu\n2. Taijutsu\n3. Genjutsu"));
	opt--;
	
	
	
	if(jutsu[opt]>0){
	horas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas entreno?"));
	JOptionPane.showMessageDialog(null,"Su numero previo de horas era: "+jutsu[opt]+"\nEl numero de horas que entreno fue: "+horas);
	jutsu[opt]-=horas;
	//Aqui ha revisado si ya ha terminado este jutsu, si despues de esta sesion la termina, vuelve y revisa, si es el caso, lo felicita. PD: Perdon por la desorganizacion.
	
	
	if(jutsu[opt]>0){
	JOptionPane.showMessageDialog(null,"El numero de horas que le faltan: "+jutsu[opt]);
	}else{
		JOptionPane.showMessageDialog(null,"Felicitaciones! Ha terminado este Jutsu");
	}
	JOptionPane.showMessageDialog(null, "En general...\n"+acumul(jutsu));
	JOptionPane.showMessageDialog(null, "Por otro lado...\n"+printHoras(jutsu));
	
	
	}else{
		JOptionPane.showMessageDialog(null,"Usted ya termino de entrenar este Jutsu!");
		sesEntren--;
	}
		cont=JOptionPane.showConfirmDialog(null, "Volver a registrar horas?", "Mensaje de Repeticion" ,JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
	
	}
	}
	
	public static String acumul(int[] jutsu){
		int[] jutsuOriginal={500,300,200};
		for(int i=0;i<jutsu.length;i++){
			jutsuOriginal[i]-=jutsu[i];
		}
		return "En Ninjutsu ha entrenado: "+jutsuOriginal[0]+"\nEn Taijutsu ha entrenado: "+jutsuOriginal[1]+"\nEn Genjutsu ha entrenado: "+jutsuOriginal[2];
	}
	
	
	public static String printHoras(int[] jutsu){
		
		for(int i=0;i<jutsu.length;i++){
			if(jutsu[i]<0){
				jutsu[i]=0;
			}
		}
		
		return "En Ninjutsu le faltan: "+jutsu[0]+" horas"+"\nEn Taijutsu le faltan: "+jutsu[1]+" horas"+"\nEn Genjutsu le faltan: "+jutsu[2]+" horas";
	}
	
}