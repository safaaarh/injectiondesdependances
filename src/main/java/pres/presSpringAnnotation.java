package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;

public class presSpringAnnotation {
    public static void main (String[] args){
            ApplicationContext context= new AnnotationConfigApplicationContext("dao","metier");
            IMetier metier=context.getBean(IMetier.class);
             System.out.println(metier.calcul());}
}
