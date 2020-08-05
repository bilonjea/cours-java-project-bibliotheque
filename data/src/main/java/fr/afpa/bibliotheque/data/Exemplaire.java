/**
 * 
 */
package fr.afpa.bibliotheque.data;

import lombok.Data;

/**
 * @author bilonjea
 *
 */
@Data
public class Exemplaire {
	private int idExemplaire;
	private boolean disponibilite;
	private int idLivre;

}
