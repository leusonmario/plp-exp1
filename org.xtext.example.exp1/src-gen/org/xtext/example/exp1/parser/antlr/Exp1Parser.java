/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.exp1.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.exp1.parser.antlr.internal.InternalExp1Parser;
import org.xtext.example.exp1.services.Exp1GrammarAccess;

public class Exp1Parser extends AbstractAntlrParser {

	@Inject
	private Exp1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalExp1Parser createParser(XtextTokenStream stream) {
		return new InternalExp1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Exp1";
	}

	public Exp1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Exp1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
