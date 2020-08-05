/**
 * 
 */
package fr.afpa.bibliotheque.data;

import java.util.Date;

import lombok.Data;

/**
 * @author bilonjea
 *
 */
@Data
public class Emprunt {
	
	private int idEmprunt ;
	private Date dateEmprunt;
	private int idUtilisateur;
	private int idExemplaire;

}
