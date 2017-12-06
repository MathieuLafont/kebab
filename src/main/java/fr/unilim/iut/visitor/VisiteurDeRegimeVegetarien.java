package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurDeRegimeVegetarien {

	public boolean visit(Agneau agneau) {
		return false;

	}

	public boolean visit(Boeuf boeuf) {
		return false;

	}

	public boolean visit(Crevette crevette) {
		return false;

	}

	public boolean visit(Fromage fromage) {
		return false;

	}

	public boolean visit(Oignon oignon) {
		return false;

	}

	public boolean visit(Pain pain) {
		return false;

	}

	public boolean visit(Salade salade) {
		return false;

	}

	public boolean visit(Sauce sauce) {
		return false;

	}

	public boolean visit(Thon thon) {
		return false;

	}

	public boolean visit(Tomate tomate) {
		return false;

	}

	public boolean visit(Assiette assiette) {
		return false;

	}

}
