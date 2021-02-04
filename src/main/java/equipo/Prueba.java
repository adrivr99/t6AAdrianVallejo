/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author adriv
 */
public class Prueba {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Adrian", "Vallejo Robles", LocalDate.of(1999,8,15));
        Futbolista f2 = new Futbolista("Marcelo", "Vieira", LocalDate.of(1983,7,10));
        
        Defensa d1 = new Defensa("Nacho", "Fernández", LocalDate.of(1987,2,7), 6, false);
        Defensa d2 = new Defensa("Raphael", "Varane", LocalDate.of(1989,3,28), 5, true);
        
        Central c1 = new Central("Sergio", "Ramos", LocalDate.of(1984,7,10), 6, true, 85, 184, 40);
        Central c2 = new Central("Eder", "Militao", LocalDate.of(1994,1,15), 6, false, 85, 184, 40);
        
        Lateral l1 = new Lateral("Daniel", "Carvajal", LocalDate.of(1984,7,10), 6, false, 80, 170, 55, "Equilibrado");
        Lateral l2 = new Lateral("Ferland", "Mendy", LocalDate.of(1992,11,24), 23, true, 80, 180, 65, "Defensivo");
        
        ArrayList<Futbolista> futbolistas = new ArrayList<>();

        futbolistas.add(f1);
        futbolistas.add(f2);

        futbolistas.add(d1);
        futbolistas.add(d2);

        futbolistas.add(c1);
        futbolistas.add(c2);

        futbolistas.add(l1);
        futbolistas.add(l2);
        
    }
}
