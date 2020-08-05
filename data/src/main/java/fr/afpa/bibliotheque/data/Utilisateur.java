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
public class Utilisateur {
	private int idUtilisateur;
	private String nom;
	private String prenom;
	private Date datenaissance;
	private String role;
	private String pseudo;
	private String motdepasse;

}
