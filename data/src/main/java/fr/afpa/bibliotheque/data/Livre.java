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
public class Livre {
	private int idLivre;
	private String titre;
	private String description;
	private String isbn;
	private String code;
}
