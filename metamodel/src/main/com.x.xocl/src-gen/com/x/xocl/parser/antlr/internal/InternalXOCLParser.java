package com.x.xocl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.x.xocl.services.XOCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXOCLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'partner'", "'responsibilities'", "'('", "','", "')'", "'process'", "'description'", "'preconditions'", "'entity'", "'state'", "'['", "']'", "'postconditions'", "'success'", "'failure'", "'workflow'", "'<'", "'>'", "'implements'", "'branch'", "'condition'", "'transaction'", "'='", "'sender'", "'receiver'", "'inform'", "'send'", "'messages'", "'requires'", "'authorization'", "'nonrepudiation'", "'notify'", "'retries'", "'timeouts'", "'receipt'", "'validation'", "'receive'", "'response'", "'protocol'", "'message'", "'s'", "'m'", "'h'", "'d'", "'confirm'", "'query'", "'obligation'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXOCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXOCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXOCLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g"; }



     	private XOCLGrammarAccess grammarAccess;
     	
        public InternalXOCLParser(TokenStream input, XOCLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected XOCLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:68:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:69:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:70:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:77:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleTopLevelElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:80:28: ( ( (lv_elements_0_0= ruleTopLevelElement ) )* )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:81:1: ( (lv_elements_0_0= ruleTopLevelElement ) )*
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:81:1: ( (lv_elements_0_0= ruleTopLevelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:82:1: (lv_elements_0_0= ruleTopLevelElement )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:82:1: (lv_elements_0_0= ruleTopLevelElement )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:83:3: lv_elements_0_0= ruleTopLevelElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTopLevelElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevelElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleTopLevelElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"TopLevelElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleTopLevelElement"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:107:1: entryRuleTopLevelElement returns [EObject current=null] : iv_ruleTopLevelElement= ruleTopLevelElement EOF ;
    public final EObject entryRuleTopLevelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelElement = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:108:2: (iv_ruleTopLevelElement= ruleTopLevelElement EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:109:2: iv_ruleTopLevelElement= ruleTopLevelElement EOF
            {
             newCompositeNode(grammarAccess.getTopLevelElementRule()); 
            pushFollow(FOLLOW_ruleTopLevelElement_in_entryRuleTopLevelElement166);
            iv_ruleTopLevelElement=ruleTopLevelElement();

            state._fsp--;

             current =iv_ruleTopLevelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelElement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevelElement"


    // $ANTLR start "ruleTopLevelElement"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:116:1: ruleTopLevelElement returns [EObject current=null] : (this_Import_0= ruleImport | this_Package_1= rulePackage ) ;
    public final EObject ruleTopLevelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_Package_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:119:28: ( (this_Import_0= ruleImport | this_Package_1= rulePackage ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:120:1: (this_Import_0= ruleImport | this_Package_1= rulePackage )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:120:1: (this_Import_0= ruleImport | this_Package_1= rulePackage )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:121:5: this_Import_0= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getTopLevelElementAccess().getImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleTopLevelElement223);
                    this_Import_0=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:131:5: this_Package_1= rulePackage
                    {
                     
                            newCompositeNode(grammarAccess.getTopLevelElementAccess().getPackageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePackage_in_ruleTopLevelElement250);
                    this_Package_1=rulePackage();

                    state._fsp--;

                     
                            current = this_Package_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelElement"


    // $ANTLR start "entryRuleImport"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:148:2: (iv_ruleImport= ruleImport EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:149:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport285);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:156:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_package_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_package_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:159:28: ( (otherlv_0= 'import' ( (lv_package_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:160:1: (otherlv_0= 'import' ( (lv_package_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:160:1: (otherlv_0= 'import' ( (lv_package_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:160:3: otherlv_0= 'import' ( (lv_package_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport332); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:164:1: ( (lv_package_1_0= ruleQualifiedNameWithWildcard ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:165:1: (lv_package_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:165:1: (lv_package_1_0= ruleQualifiedNameWithWildcard )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:166:3: lv_package_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getPackageQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport353);
            lv_package_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"package",
                    		lv_package_1_0, 
                    		"QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:190:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:191:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:192:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard390);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard401); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:199:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PackageName_0= rulePackageName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PackageName_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:202:28: ( (this_PackageName_0= rulePackageName (kw= '.*' )? ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:203:1: (this_PackageName_0= rulePackageName (kw= '.*' )? )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:203:1: (this_PackageName_0= rulePackageName (kw= '.*' )? )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:204:5: this_PackageName_0= rulePackageName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getPackageNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePackageName_in_ruleQualifiedNameWithWildcard448);
            this_PackageName_0=rulePackageName();

            state._fsp--;


            		current.merge(this_PackageName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:214:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:215:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildcard467); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRulePackageName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:228:1: entryRulePackageName returns [String current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final String entryRulePackageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackageName = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:229:2: (iv_rulePackageName= rulePackageName EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:230:2: iv_rulePackageName= rulePackageName EOF
            {
             newCompositeNode(grammarAccess.getPackageNameRule()); 
            pushFollow(FOLLOW_rulePackageName_in_entryRulePackageName510);
            iv_rulePackageName=rulePackageName();

            state._fsp--;

             current =iv_rulePackageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageName521); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:237:1: rulePackageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken rulePackageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:240:28: (this_QualifiedName_0= ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:242:5: this_QualifiedName_0= ruleQualifiedName
            {
             
                    newCompositeNode(grammarAccess.getPackageNameAccess().getQualifiedNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageName567);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageName"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:260:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:261:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:262:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName612);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:269:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:272:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:273:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:273:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:273:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName663); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:280:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:281:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName682); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName697); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRulePackage"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:301:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:302:2: (iv_rulePackage= rulePackage EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:303:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage744);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage754); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:310:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) ( (lv_version_2_0= ruleVersionString ) )? otherlv_3= '{' ( (lv_elements_4_0= rulePackageElement ) )+ otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_version_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:313:28: ( (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) ( (lv_version_2_0= ruleVersionString ) )? otherlv_3= '{' ( (lv_elements_4_0= rulePackageElement ) )+ otherlv_5= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:314:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) ( (lv_version_2_0= ruleVersionString ) )? otherlv_3= '{' ( (lv_elements_4_0= rulePackageElement ) )+ otherlv_5= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:314:1: (otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) ( (lv_version_2_0= ruleVersionString ) )? otherlv_3= '{' ( (lv_elements_4_0= rulePackageElement ) )+ otherlv_5= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:314:3: otherlv_0= 'package' ( (lv_name_1_0= rulePackageName ) ) ( (lv_version_2_0= ruleVersionString ) )? otherlv_3= '{' ( (lv_elements_4_0= rulePackageElement ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePackage791); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:318:1: ( (lv_name_1_0= rulePackageName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:319:1: (lv_name_1_0= rulePackageName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:319:1: (lv_name_1_0= rulePackageName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:320:3: lv_name_1_0= rulePackageName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNamePackageNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackageName_in_rulePackage812);
            lv_name_1_0=rulePackageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"PackageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:336:2: ( (lv_version_2_0= ruleVersionString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:337:1: (lv_version_2_0= ruleVersionString )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:337:1: (lv_version_2_0= ruleVersionString )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:338:3: lv_version_2_0= ruleVersionString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getVersionVersionStringParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVersionString_in_rulePackage833);
                    lv_version_2_0=ruleVersionString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_2_0, 
                            		"VersionString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePackage846); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:358:1: ( (lv_elements_4_0= rulePackageElement ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17||LA6_0==22||LA6_0==25||LA6_0==32||LA6_0==42||LA6_0==48||(LA6_0>=54 && LA6_0<=55)||(LA6_0>=61 && LA6_0<=63)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:359:1: (lv_elements_4_0= rulePackageElement )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:359:1: (lv_elements_4_0= rulePackageElement )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:360:3: lv_elements_4_0= rulePackageElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackageElement_in_rulePackage867);
            	    lv_elements_4_0=rulePackageElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"PackageElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePackage880); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleVersionString"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:388:1: entryRuleVersionString returns [EObject current=null] : iv_ruleVersionString= ruleVersionString EOF ;
    public final EObject entryRuleVersionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionString = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:389:2: (iv_ruleVersionString= ruleVersionString EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:390:2: iv_ruleVersionString= ruleVersionString EOF
            {
             newCompositeNode(grammarAccess.getVersionStringRule()); 
            pushFollow(FOLLOW_ruleVersionString_in_entryRuleVersionString916);
            iv_ruleVersionString=ruleVersionString();

            state._fsp--;

             current =iv_ruleVersionString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionString926); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionString"


    // $ANTLR start "ruleVersionString"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:397:1: ruleVersionString returns [EObject current=null] : (this_TwoPartVersionString_0= ruleTwoPartVersionString | this_FourPartVersionString_1= ruleFourPartVersionString ) ;
    public final EObject ruleVersionString() throws RecognitionException {
        EObject current = null;

        EObject this_TwoPartVersionString_0 = null;

        EObject this_FourPartVersionString_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:400:28: ( (this_TwoPartVersionString_0= ruleTwoPartVersionString | this_FourPartVersionString_1= ruleFourPartVersionString ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:401:1: (this_TwoPartVersionString_0= ruleTwoPartVersionString | this_FourPartVersionString_1= ruleFourPartVersionString )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:401:1: (this_TwoPartVersionString_0= ruleTwoPartVersionString | this_FourPartVersionString_1= ruleFourPartVersionString )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==13) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_INT) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==EOF||LA7_3==15) ) {
                            alt7=1;
                        }
                        else if ( (LA7_3==13) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:402:5: this_TwoPartVersionString_0= ruleTwoPartVersionString
                    {
                     
                            newCompositeNode(grammarAccess.getVersionStringAccess().getTwoPartVersionStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTwoPartVersionString_in_ruleVersionString973);
                    this_TwoPartVersionString_0=ruleTwoPartVersionString();

                    state._fsp--;

                     
                            current = this_TwoPartVersionString_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:412:5: this_FourPartVersionString_1= ruleFourPartVersionString
                    {
                     
                            newCompositeNode(grammarAccess.getVersionStringAccess().getFourPartVersionStringParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFourPartVersionString_in_ruleVersionString1000);
                    this_FourPartVersionString_1=ruleFourPartVersionString();

                    state._fsp--;

                     
                            current = this_FourPartVersionString_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionString"


    // $ANTLR start "entryRuleTwoPartVersionString"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:428:1: entryRuleTwoPartVersionString returns [EObject current=null] : iv_ruleTwoPartVersionString= ruleTwoPartVersionString EOF ;
    public final EObject entryRuleTwoPartVersionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwoPartVersionString = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:429:2: (iv_ruleTwoPartVersionString= ruleTwoPartVersionString EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:430:2: iv_ruleTwoPartVersionString= ruleTwoPartVersionString EOF
            {
             newCompositeNode(grammarAccess.getTwoPartVersionStringRule()); 
            pushFollow(FOLLOW_ruleTwoPartVersionString_in_entryRuleTwoPartVersionString1035);
            iv_ruleTwoPartVersionString=ruleTwoPartVersionString();

            state._fsp--;

             current =iv_ruleTwoPartVersionString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTwoPartVersionString1045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTwoPartVersionString"


    // $ANTLR start "ruleTwoPartVersionString"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:437:1: ruleTwoPartVersionString returns [EObject current=null] : ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTwoPartVersionString() throws RecognitionException {
        EObject current = null;

        Token lv_major_0_0=null;
        Token otherlv_1=null;
        Token lv_minor_2_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:440:28: ( ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:441:1: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:441:1: ( ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:441:2: ( (lv_major_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_minor_2_0= RULE_INT ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:441:2: ( (lv_major_0_0= RULE_INT ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:442:1: (lv_major_0_0= RULE_INT )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:442:1: (lv_major_0_0= RULE_INT )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:443:3: lv_major_0_0= RULE_INT
            {
            lv_major_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTwoPartVersionString1087); 

            			newLeafNode(lv_major_0_0, grammarAccess.getTwoPartVersionStringAccess().getMajorINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTwoPartVersionStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"major",
                    		lv_major_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTwoPartVersionString1104); 

                	newLeafNode(otherlv_1, grammarAccess.getTwoPartVersionStringAccess().getFullStopKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:463:1: ( (lv_minor_2_0= RULE_INT ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:464:1: (lv_minor_2_0= RULE_INT )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:464:1: (lv_minor_2_0= RULE_INT )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:465:3: lv_minor_2_0= RULE_INT
            {
            lv_minor_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTwoPartVersionString1121); 

            			newLeafNode(lv_minor_2_0, grammarAccess.getTwoPartVersionStringAccess().getMinorINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTwoPartVersionStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minor",
                    		lv_minor_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwoPartVersionString"


    // $ANTLR start "entryRuleFourPartVersionString"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:489:1: entryRuleFourPartVersionString returns [EObject current=null] : iv_ruleFourPartVersionString= ruleFourPartVersionString EOF ;
    public final EObject entryRuleFourPartVersionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFourPartVersionString = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:490:2: (iv_ruleFourPartVersionString= ruleFourPartVersionString EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:491:2: iv_ruleFourPartVersionString= ruleFourPartVersionString EOF
            {
             newCompositeNode(grammarAccess.getFourPartVersionStringRule()); 
            pushFollow(FOLLOW_ruleFourPartVersionString_in_entryRuleFourPartVersionString1162);
            iv_ruleFourPartVersionString=ruleFourPartVersionString();

            state._fsp--;

             current =iv_ruleFourPartVersionString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFourPartVersionString1172); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFourPartVersionString"


    // $ANTLR start "ruleFourPartVersionString"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:498:1: ruleFourPartVersionString returns [EObject current=null] : (this_TwoPartVersionString_0= ruleTwoPartVersionString ( (lv_release_1_0= '.' ) ) this_INT_2= RULE_INT ( (lv_build_3_0= '.' ) ) this_INT_4= RULE_INT ) ;
    public final EObject ruleFourPartVersionString() throws RecognitionException {
        EObject current = null;

        Token lv_release_1_0=null;
        Token this_INT_2=null;
        Token lv_build_3_0=null;
        Token this_INT_4=null;
        EObject this_TwoPartVersionString_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:501:28: ( (this_TwoPartVersionString_0= ruleTwoPartVersionString ( (lv_release_1_0= '.' ) ) this_INT_2= RULE_INT ( (lv_build_3_0= '.' ) ) this_INT_4= RULE_INT ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:502:1: (this_TwoPartVersionString_0= ruleTwoPartVersionString ( (lv_release_1_0= '.' ) ) this_INT_2= RULE_INT ( (lv_build_3_0= '.' ) ) this_INT_4= RULE_INT )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:502:1: (this_TwoPartVersionString_0= ruleTwoPartVersionString ( (lv_release_1_0= '.' ) ) this_INT_2= RULE_INT ( (lv_build_3_0= '.' ) ) this_INT_4= RULE_INT )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:503:5: this_TwoPartVersionString_0= ruleTwoPartVersionString ( (lv_release_1_0= '.' ) ) this_INT_2= RULE_INT ( (lv_build_3_0= '.' ) ) this_INT_4= RULE_INT
            {
             
                    newCompositeNode(grammarAccess.getFourPartVersionStringAccess().getTwoPartVersionStringParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTwoPartVersionString_in_ruleFourPartVersionString1219);
            this_TwoPartVersionString_0=ruleTwoPartVersionString();

            state._fsp--;

             
                    current = this_TwoPartVersionString_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:511:1: ( (lv_release_1_0= '.' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:512:1: (lv_release_1_0= '.' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:512:1: (lv_release_1_0= '.' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:513:3: lv_release_1_0= '.'
            {
            lv_release_1_0=(Token)match(input,13,FOLLOW_13_in_ruleFourPartVersionString1236); 

                    newLeafNode(lv_release_1_0, grammarAccess.getFourPartVersionStringAccess().getReleaseFullStopKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFourPartVersionStringRule());
            	        }
                   		setWithLastConsumed(current, "release", lv_release_1_0, ".");
            	    

            }


            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFourPartVersionString1260); 
             
                newLeafNode(this_INT_2, grammarAccess.getFourPartVersionStringAccess().getINTTerminalRuleCall_2()); 
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:530:1: ( (lv_build_3_0= '.' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:531:1: (lv_build_3_0= '.' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:531:1: (lv_build_3_0= '.' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:532:3: lv_build_3_0= '.'
            {
            lv_build_3_0=(Token)match(input,13,FOLLOW_13_in_ruleFourPartVersionString1277); 

                    newLeafNode(lv_build_3_0, grammarAccess.getFourPartVersionStringAccess().getBuildFullStopKeyword_3_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFourPartVersionStringRule());
            	        }
                   		setWithLastConsumed(current, "build", lv_build_3_0, ".");
            	    

            }


            }

            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFourPartVersionString1301); 
             
                newLeafNode(this_INT_4, grammarAccess.getFourPartVersionStringAccess().getINTTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFourPartVersionString"


    // $ANTLR start "entryRulePackageElement"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:557:1: entryRulePackageElement returns [EObject current=null] : iv_rulePackageElement= rulePackageElement EOF ;
    public final EObject entryRulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageElement = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:558:2: (iv_rulePackageElement= rulePackageElement EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:559:2: iv_rulePackageElement= rulePackageElement EOF
            {
             newCompositeNode(grammarAccess.getPackageElementRule()); 
            pushFollow(FOLLOW_rulePackageElement_in_entryRulePackageElement1336);
            iv_rulePackageElement=rulePackageElement();

            state._fsp--;

             current =iv_rulePackageElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageElement1346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageElement"


    // $ANTLR start "rulePackageElement"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:566:1: rulePackageElement returns [EObject current=null] : (this_Partner_0= rulePartner | this_Process_1= ruleProcess | this_Entity_2= ruleEntity | this_Workflow_3= ruleWorkflow | this_Transaction_4= ruleTransaction | this_Protocol_5= ruleProtocol ) ;
    public final EObject rulePackageElement() throws RecognitionException {
        EObject current = null;

        EObject this_Partner_0 = null;

        EObject this_Process_1 = null;

        EObject this_Entity_2 = null;

        EObject this_Workflow_3 = null;

        EObject this_Transaction_4 = null;

        EObject this_Protocol_5 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:569:28: ( (this_Partner_0= rulePartner | this_Process_1= ruleProcess | this_Entity_2= ruleEntity | this_Workflow_3= ruleWorkflow | this_Transaction_4= ruleTransaction | this_Protocol_5= ruleProtocol ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:570:1: (this_Partner_0= rulePartner | this_Process_1= ruleProcess | this_Entity_2= ruleEntity | this_Workflow_3= ruleWorkflow | this_Transaction_4= ruleTransaction | this_Protocol_5= ruleProtocol )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:570:1: (this_Partner_0= rulePartner | this_Process_1= ruleProcess | this_Entity_2= ruleEntity | this_Workflow_3= ruleWorkflow | this_Transaction_4= ruleTransaction | this_Protocol_5= ruleProtocol )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 42:
            case 48:
            case 54:
            case 61:
            case 62:
            case 63:
                {
                alt8=5;
                }
                break;
            case 55:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:571:5: this_Partner_0= rulePartner
                    {
                     
                            newCompositeNode(grammarAccess.getPackageElementAccess().getPartnerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePartner_in_rulePackageElement1393);
                    this_Partner_0=rulePartner();

                    state._fsp--;

                     
                            current = this_Partner_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:581:5: this_Process_1= ruleProcess
                    {
                     
                            newCompositeNode(grammarAccess.getPackageElementAccess().getProcessParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProcess_in_rulePackageElement1420);
                    this_Process_1=ruleProcess();

                    state._fsp--;

                     
                            current = this_Process_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:591:5: this_Entity_2= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getPackageElementAccess().getEntityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_rulePackageElement1447);
                    this_Entity_2=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:601:5: this_Workflow_3= ruleWorkflow
                    {
                     
                            newCompositeNode(grammarAccess.getPackageElementAccess().getWorkflowParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleWorkflow_in_rulePackageElement1474);
                    this_Workflow_3=ruleWorkflow();

                    state._fsp--;

                     
                            current = this_Workflow_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:611:5: this_Transaction_4= ruleTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getPackageElementAccess().getTransactionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTransaction_in_rulePackageElement1501);
                    this_Transaction_4=ruleTransaction();

                    state._fsp--;

                     
                            current = this_Transaction_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:621:5: this_Protocol_5= ruleProtocol
                    {
                     
                            newCompositeNode(grammarAccess.getPackageElementAccess().getProtocolParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleProtocol_in_rulePackageElement1528);
                    this_Protocol_5=ruleProtocol();

                    state._fsp--;

                     
                            current = this_Protocol_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageElement"


    // $ANTLR start "entryRulePartner"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:637:1: entryRulePartner returns [EObject current=null] : iv_rulePartner= rulePartner EOF ;
    public final EObject entryRulePartner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartner = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:638:2: (iv_rulePartner= rulePartner EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:639:2: iv_rulePartner= rulePartner EOF
            {
             newCompositeNode(grammarAccess.getPartnerRule()); 
            pushFollow(FOLLOW_rulePartner_in_entryRulePartner1563);
            iv_rulePartner=rulePartner();

            state._fsp--;

             current =iv_rulePartner; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePartner1573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartner"


    // $ANTLR start "rulePartner"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:646:1: rulePartner returns [EObject current=null] : (otherlv_0= 'partner' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'responsibilities' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject rulePartner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:649:28: ( (otherlv_0= 'partner' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'responsibilities' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:650:1: (otherlv_0= 'partner' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'responsibilities' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:650:1: (otherlv_0= 'partner' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'responsibilities' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:650:3: otherlv_0= 'partner' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'responsibilities' otherlv_4= '(' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePartner1610); 

                	newLeafNode(otherlv_0, grammarAccess.getPartnerAccess().getPartnerKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:654:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:655:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:655:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:656:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePartner1627); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPartnerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPartnerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePartner1644); 

                	newLeafNode(otherlv_2, grammarAccess.getPartnerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_rulePartner1656); 

                	newLeafNode(otherlv_3, grammarAccess.getPartnerAccess().getResponsibilitiesKeyword_3());
                
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePartner1668); 

                	newLeafNode(otherlv_4, grammarAccess.getPartnerAccess().getLeftParenthesisKeyword_4());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:684:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:685:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:685:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:686:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPartnerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPartnerAccess().getResponsibilitiesProcessRoleCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePartner1691);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:699:2: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:699:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_rulePartner1704); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPartnerAccess().getCommaKeyword_6_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:703:1: ( ( ruleQualifiedName ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:704:1: ( ruleQualifiedName )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:704:1: ( ruleQualifiedName )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:705:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPartnerRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getPartnerAccess().getResponsibilitiesProcessRoleCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePartner1727);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_rulePartner1741); 

                	newLeafNode(otherlv_8, grammarAccess.getPartnerAccess().getRightParenthesisKeyword_7());
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_rulePartner1753); 

                	newLeafNode(otherlv_9, grammarAccess.getPartnerAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartner"


    // $ANTLR start "entryRuleProcess"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:734:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:735:2: (iv_ruleProcess= ruleProcess EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:736:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess1789);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess1799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:743:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_roles_3_0= ruleProcessRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) ) )+ otherlv_6= ')' otherlv_7= '{' otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_preconditions_10_0= rulePreconditions ) )? ( (lv_postconditions_11_0= rulePostconditions ) )? otherlv_12= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_12=null;
        EObject lv_roles_3_0 = null;

        EObject lv_roles_5_0 = null;

        EObject lv_preconditions_10_0 = null;

        EObject lv_postconditions_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:746:28: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_roles_3_0= ruleProcessRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) ) )+ otherlv_6= ')' otherlv_7= '{' otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_preconditions_10_0= rulePreconditions ) )? ( (lv_postconditions_11_0= rulePostconditions ) )? otherlv_12= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:747:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_roles_3_0= ruleProcessRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) ) )+ otherlv_6= ')' otherlv_7= '{' otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_preconditions_10_0= rulePreconditions ) )? ( (lv_postconditions_11_0= rulePostconditions ) )? otherlv_12= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:747:1: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_roles_3_0= ruleProcessRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) ) )+ otherlv_6= ')' otherlv_7= '{' otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_preconditions_10_0= rulePreconditions ) )? ( (lv_postconditions_11_0= rulePostconditions ) )? otherlv_12= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:747:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_roles_3_0= ruleProcessRole ) ) (otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) ) )+ otherlv_6= ')' otherlv_7= '{' otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) ( (lv_preconditions_10_0= rulePreconditions ) )? ( (lv_postconditions_11_0= rulePostconditions ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleProcess1836); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:751:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:752:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:752:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:753:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcess1853); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleProcess1870); 

                	newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftParenthesisKeyword_2());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:773:1: ( (lv_roles_3_0= ruleProcessRole ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:774:1: (lv_roles_3_0= ruleProcessRole )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:774:1: (lv_roles_3_0= ruleProcessRole )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:775:3: lv_roles_3_0= ruleProcessRole
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getRolesProcessRoleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleProcessRole_in_ruleProcess1891);
            lv_roles_3_0=ruleProcessRole();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		add(
                   			current, 
                   			"roles",
                    		lv_roles_3_0, 
                    		"ProcessRole");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:791:2: (otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:791:4: otherlv_4= ',' ( (lv_roles_5_0= ruleProcessRole ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleProcess1904); 

            	        	newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:795:1: ( (lv_roles_5_0= ruleProcessRole ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:796:1: (lv_roles_5_0= ruleProcessRole )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:796:1: (lv_roles_5_0= ruleProcessRole )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:797:3: lv_roles_5_0= ruleProcessRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcessAccess().getRolesProcessRoleParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcessRole_in_ruleProcess1925);
            	    lv_roles_5_0=ruleProcessRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_5_0, 
            	            		"ProcessRole");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleProcess1939); 

                	newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightParenthesisKeyword_5());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleProcess1951); 

                	newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleProcess1963); 

                	newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getDescriptionKeyword_7());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:825:1: ( (lv_description_9_0= RULE_STRING ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:826:1: (lv_description_9_0= RULE_STRING )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:826:1: (lv_description_9_0= RULE_STRING )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:827:3: lv_description_9_0= RULE_STRING
            {
            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleProcess1980); 

            			newLeafNode(lv_description_9_0, grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_9_0, 
                    		"STRING");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:843:2: ( (lv_preconditions_10_0= rulePreconditions ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:844:1: (lv_preconditions_10_0= rulePreconditions )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:844:1: (lv_preconditions_10_0= rulePreconditions )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:845:3: lv_preconditions_10_0= rulePreconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessAccess().getPreconditionsPreconditionsParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_rulePreconditions_in_ruleProcess2006);
                    lv_preconditions_10_0=rulePreconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	        }
                           		set(
                           			current, 
                           			"preconditions",
                            		lv_preconditions_10_0, 
                            		"Preconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:861:3: ( (lv_postconditions_11_0= rulePostconditions ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:862:1: (lv_postconditions_11_0= rulePostconditions )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:862:1: (lv_postconditions_11_0= rulePostconditions )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:863:3: lv_postconditions_11_0= rulePostconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessAccess().getPostconditionsPostconditionsParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_rulePostconditions_in_ruleProcess2028);
                    lv_postconditions_11_0=rulePostconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	        }
                           		set(
                           			current, 
                           			"postconditions",
                            		lv_postconditions_11_0, 
                            		"Postconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleProcess2041); 

                	newLeafNode(otherlv_12, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessRole"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:891:1: entryRuleProcessRole returns [EObject current=null] : iv_ruleProcessRole= ruleProcessRole EOF ;
    public final EObject entryRuleProcessRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessRole = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:892:2: (iv_ruleProcessRole= ruleProcessRole EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:893:2: iv_ruleProcessRole= ruleProcessRole EOF
            {
             newCompositeNode(grammarAccess.getProcessRoleRule()); 
            pushFollow(FOLLOW_ruleProcessRole_in_entryRuleProcessRole2077);
            iv_ruleProcessRole=ruleProcessRole();

            state._fsp--;

             current =iv_ruleProcessRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessRole2087); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessRole"


    // $ANTLR start "ruleProcessRole"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:900:1: ruleProcessRole returns [EObject current=null] : this_Role_0= ruleRole ;
    public final EObject ruleProcessRole() throws RecognitionException {
        EObject current = null;

        EObject this_Role_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:903:28: (this_Role_0= ruleRole )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:905:5: this_Role_0= ruleRole
            {
             
                    newCompositeNode(grammarAccess.getProcessRoleAccess().getRoleParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRole_in_ruleProcessRole2133);
            this_Role_0=ruleRole();

            state._fsp--;

             
                    current = this_Role_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessRole"


    // $ANTLR start "entryRuleRole"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:921:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:922:2: (iv_ruleRole= ruleRole EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:923:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole2167);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole2177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:930:1: ruleRole returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:933:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:934:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:934:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:935:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:935:1: (lv_name_0_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:936:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole2218); 

            			newLeafNode(lv_name_0_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRulePreconditions"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:960:1: entryRulePreconditions returns [EObject current=null] : iv_rulePreconditions= rulePreconditions EOF ;
    public final EObject entryRulePreconditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreconditions = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:961:2: (iv_rulePreconditions= rulePreconditions EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:962:2: iv_rulePreconditions= rulePreconditions EOF
            {
             newCompositeNode(grammarAccess.getPreconditionsRule()); 
            pushFollow(FOLLOW_rulePreconditions_in_entryRulePreconditions2258);
            iv_rulePreconditions=rulePreconditions();

            state._fsp--;

             current =iv_rulePreconditions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreconditions2268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreconditions"


    // $ANTLR start "rulePreconditions"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:969:1: rulePreconditions returns [EObject current=null] : (otherlv_0= 'preconditions' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ')' ) ;
    public final EObject rulePreconditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:972:28: ( (otherlv_0= 'preconditions' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:973:1: (otherlv_0= 'preconditions' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:973:1: (otherlv_0= 'preconditions' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:973:3: otherlv_0= 'preconditions' otherlv_1= '(' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulePreconditions2305); 

                	newLeafNode(otherlv_0, grammarAccess.getPreconditionsAccess().getPreconditionsKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_rulePreconditions2317); 

                	newLeafNode(otherlv_1, grammarAccess.getPreconditionsAccess().getLeftParenthesisKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:981:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:982:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:982:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:983:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPreconditionsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPreconditionsAccess().getConditionsEntityStateCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePreconditions2340);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:996:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:996:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePreconditions2353); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPreconditionsAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1000:1: ( ( ruleQualifiedName ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1001:1: ( ruleQualifiedName )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1001:1: ( ruleQualifiedName )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1002:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPreconditionsRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getPreconditionsAccess().getConditionsEntityStateCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePreconditions2376);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_rulePreconditions2390); 

                	newLeafNode(otherlv_5, grammarAccess.getPreconditionsAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreconditions"


    // $ANTLR start "entryRuleEntity"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1027:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1028:2: (iv_ruleEntity= ruleEntity EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1029:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2426);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1036:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleEntityState ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_states_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1039:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleEntityState ) )+ otherlv_4= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1040:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleEntityState ) )+ otherlv_4= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1040:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleEntityState ) )+ otherlv_4= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1040:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_states_3_0= ruleEntityState ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleEntity2473); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1044:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1045:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1045:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1046:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2490); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEntity2507); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1066:1: ( (lv_states_3_0= ruleEntityState ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1067:1: (lv_states_3_0= ruleEntityState )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1067:1: (lv_states_3_0= ruleEntityState )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1068:3: lv_states_3_0= ruleEntityState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getStatesEntityStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityState_in_ruleEntity2528);
            	    lv_states_3_0=ruleEntityState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_3_0, 
            	            		"EntityState");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEntity2541); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityState"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1096:1: entryRuleEntityState returns [EObject current=null] : iv_ruleEntityState= ruleEntityState EOF ;
    public final EObject entryRuleEntityState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityState = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1097:2: (iv_ruleEntityState= ruleEntityState EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1098:2: iv_ruleEntityState= ruleEntityState EOF
            {
             newCompositeNode(grammarAccess.getEntityStateRule()); 
            pushFollow(FOLLOW_ruleEntityState_in_entryRuleEntityState2577);
            iv_ruleEntityState=ruleEntityState();

            state._fsp--;

             current =iv_ruleEntityState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityState2587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityState"


    // $ANTLR start "ruleEntityState"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1105:1: ruleEntityState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']' )? ) ;
    public final EObject ruleEntityState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_transitions_3_0 = null;

        EObject lv_transitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1108:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']' )? ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1109:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']' )? )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1109:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']' )? )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1109:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEntityState2624); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityStateAccess().getStateKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1113:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1114:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1114:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1115:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityState2641); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1131:2: (otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1131:4: otherlv_2= '[' ( (lv_transitions_3_0= ruleEntityStateTransition ) ) (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleEntityState2659); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityStateAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1135:1: ( (lv_transitions_3_0= ruleEntityStateTransition ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1136:1: (lv_transitions_3_0= ruleEntityStateTransition )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1136:1: (lv_transitions_3_0= ruleEntityStateTransition )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1137:3: lv_transitions_3_0= ruleEntityStateTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityStateAccess().getTransitionsEntityStateTransitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEntityStateTransition_in_ruleEntityState2680);
                    lv_transitions_3_0=ruleEntityStateTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityStateRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_3_0, 
                            		"EntityStateTransition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1153:2: (otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1153:4: otherlv_4= ',' ( (lv_transitions_5_0= ruleEntityStateTransition ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleEntityState2693); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEntityStateAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1157:1: ( (lv_transitions_5_0= ruleEntityStateTransition ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1158:1: (lv_transitions_5_0= ruleEntityStateTransition )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1158:1: (lv_transitions_5_0= ruleEntityStateTransition )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1159:3: lv_transitions_5_0= ruleEntityStateTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityStateAccess().getTransitionsEntityStateTransitionParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEntityStateTransition_in_ruleEntityState2714);
                    	    lv_transitions_5_0=ruleEntityStateTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_5_0, 
                    	            		"EntityStateTransition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleEntityState2728); 

                        	newLeafNode(otherlv_6, grammarAccess.getEntityStateAccess().getRightSquareBracketKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityState"


    // $ANTLR start "entryRuleEntityStateTransition"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1187:1: entryRuleEntityStateTransition returns [EObject current=null] : iv_ruleEntityStateTransition= ruleEntityStateTransition EOF ;
    public final EObject entryRuleEntityStateTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityStateTransition = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1188:2: (iv_ruleEntityStateTransition= ruleEntityStateTransition EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1189:2: iv_ruleEntityStateTransition= ruleEntityStateTransition EOF
            {
             newCompositeNode(grammarAccess.getEntityStateTransitionRule()); 
            pushFollow(FOLLOW_ruleEntityStateTransition_in_entryRuleEntityStateTransition2766);
            iv_ruleEntityStateTransition=ruleEntityStateTransition();

            state._fsp--;

             current =iv_ruleEntityStateTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityStateTransition2776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityStateTransition"


    // $ANTLR start "ruleEntityStateTransition"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1196:1: ruleEntityStateTransition returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityStateTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1199:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1200:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1200:1: ( (otherlv_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1201:1: (otherlv_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1201:1: (otherlv_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1202:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityStateTransitionRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityStateTransition2820); 

            		newLeafNode(otherlv_0, grammarAccess.getEntityStateTransitionAccess().getSuccessorEntityStateCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityStateTransition"


    // $ANTLR start "entryRulePostconditions"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1221:1: entryRulePostconditions returns [EObject current=null] : iv_rulePostconditions= rulePostconditions EOF ;
    public final EObject entryRulePostconditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostconditions = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1222:2: (iv_rulePostconditions= rulePostconditions EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1223:2: iv_rulePostconditions= rulePostconditions EOF
            {
             newCompositeNode(grammarAccess.getPostconditionsRule()); 
            pushFollow(FOLLOW_rulePostconditions_in_entryRulePostconditions2855);
            iv_rulePostconditions=rulePostconditions();

            state._fsp--;

             current =iv_rulePostconditions; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostconditions2865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostconditions"


    // $ANTLR start "rulePostconditions"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1230:1: rulePostconditions returns [EObject current=null] : (otherlv_0= 'postconditions' () otherlv_2= '{' ( (lv_success_3_0= ruleOnProcessSuccess ) )? ( (lv_failure_4_0= ruleOnProcessFailure ) )? otherlv_5= '}' ) ;
    public final EObject rulePostconditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_success_3_0 = null;

        EObject lv_failure_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1233:28: ( (otherlv_0= 'postconditions' () otherlv_2= '{' ( (lv_success_3_0= ruleOnProcessSuccess ) )? ( (lv_failure_4_0= ruleOnProcessFailure ) )? otherlv_5= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1234:1: (otherlv_0= 'postconditions' () otherlv_2= '{' ( (lv_success_3_0= ruleOnProcessSuccess ) )? ( (lv_failure_4_0= ruleOnProcessFailure ) )? otherlv_5= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1234:1: (otherlv_0= 'postconditions' () otherlv_2= '{' ( (lv_success_3_0= ruleOnProcessSuccess ) )? ( (lv_failure_4_0= ruleOnProcessFailure ) )? otherlv_5= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1234:3: otherlv_0= 'postconditions' () otherlv_2= '{' ( (lv_success_3_0= ruleOnProcessSuccess ) )? ( (lv_failure_4_0= ruleOnProcessFailure ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePostconditions2902); 

                	newLeafNode(otherlv_0, grammarAccess.getPostconditionsAccess().getPostconditionsKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1238:1: ()
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1239:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPostconditionsAccess().getPostconditionsAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePostconditions2923); 

                	newLeafNode(otherlv_2, grammarAccess.getPostconditionsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1248:1: ( (lv_success_3_0= ruleOnProcessSuccess ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1249:1: (lv_success_3_0= ruleOnProcessSuccess )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1249:1: (lv_success_3_0= ruleOnProcessSuccess )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1250:3: lv_success_3_0= ruleOnProcessSuccess
                    {
                     
                    	        newCompositeNode(grammarAccess.getPostconditionsAccess().getSuccessOnProcessSuccessParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnProcessSuccess_in_rulePostconditions2944);
                    lv_success_3_0=ruleOnProcessSuccess();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPostconditionsRule());
                    	        }
                           		set(
                           			current, 
                           			"success",
                            		lv_success_3_0, 
                            		"OnProcessSuccess");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1266:3: ( (lv_failure_4_0= ruleOnProcessFailure ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1267:1: (lv_failure_4_0= ruleOnProcessFailure )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1267:1: (lv_failure_4_0= ruleOnProcessFailure )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1268:3: lv_failure_4_0= ruleOnProcessFailure
                    {
                     
                    	        newCompositeNode(grammarAccess.getPostconditionsAccess().getFailureOnProcessFailureParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnProcessFailure_in_rulePostconditions2966);
                    lv_failure_4_0=ruleOnProcessFailure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPostconditionsRule());
                    	        }
                           		set(
                           			current, 
                           			"failure",
                            		lv_failure_4_0, 
                            		"OnProcessFailure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePostconditions2979); 

                	newLeafNode(otherlv_5, grammarAccess.getPostconditionsAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostconditions"


    // $ANTLR start "entryRuleOnProcessSuccess"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1298:1: entryRuleOnProcessSuccess returns [EObject current=null] : iv_ruleOnProcessSuccess= ruleOnProcessSuccess EOF ;
    public final EObject entryRuleOnProcessSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnProcessSuccess = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1299:2: (iv_ruleOnProcessSuccess= ruleOnProcessSuccess EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1300:2: iv_ruleOnProcessSuccess= ruleOnProcessSuccess EOF
            {
             newCompositeNode(grammarAccess.getOnProcessSuccessRule()); 
            pushFollow(FOLLOW_ruleOnProcessSuccess_in_entryRuleOnProcessSuccess3017);
            iv_ruleOnProcessSuccess=ruleOnProcessSuccess();

            state._fsp--;

             current =iv_ruleOnProcessSuccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnProcessSuccess3027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnProcessSuccess"


    // $ANTLR start "ruleOnProcessSuccess"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1307:1: ruleOnProcessSuccess returns [EObject current=null] : (otherlv_0= 'success' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleOnProcessSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1310:28: ( (otherlv_0= 'success' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1311:1: (otherlv_0= 'success' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1311:1: (otherlv_0= 'success' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1311:3: otherlv_0= 'success' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleOnProcessSuccess3064); 

                	newLeafNode(otherlv_0, grammarAccess.getOnProcessSuccessAccess().getSuccessKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleOnProcessSuccess3076); 

                	newLeafNode(otherlv_1, grammarAccess.getOnProcessSuccessAccess().getLeftSquareBracketKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1319:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1320:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1320:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1321:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOnProcessSuccessRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOnProcessSuccessAccess().getResultsEntityStateCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOnProcessSuccess3099);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1334:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1334:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOnProcessSuccess3112); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOnProcessSuccessAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1338:1: ( ( ruleQualifiedName ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1339:1: ( ruleQualifiedName )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1339:1: ( ruleQualifiedName )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1340:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOnProcessSuccessRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getOnProcessSuccessAccess().getResultsEntityStateCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOnProcessSuccess3135);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleOnProcessSuccess3149); 

                	newLeafNode(otherlv_5, grammarAccess.getOnProcessSuccessAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnProcessSuccess"


    // $ANTLR start "entryRuleOnProcessFailure"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1365:1: entryRuleOnProcessFailure returns [EObject current=null] : iv_ruleOnProcessFailure= ruleOnProcessFailure EOF ;
    public final EObject entryRuleOnProcessFailure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnProcessFailure = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1366:2: (iv_ruleOnProcessFailure= ruleOnProcessFailure EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1367:2: iv_ruleOnProcessFailure= ruleOnProcessFailure EOF
            {
             newCompositeNode(grammarAccess.getOnProcessFailureRule()); 
            pushFollow(FOLLOW_ruleOnProcessFailure_in_entryRuleOnProcessFailure3185);
            iv_ruleOnProcessFailure=ruleOnProcessFailure();

            state._fsp--;

             current =iv_ruleOnProcessFailure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnProcessFailure3195); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnProcessFailure"


    // $ANTLR start "ruleOnProcessFailure"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1374:1: ruleOnProcessFailure returns [EObject current=null] : (otherlv_0= 'failure' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleOnProcessFailure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1377:28: ( (otherlv_0= 'failure' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1378:1: (otherlv_0= 'failure' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1378:1: (otherlv_0= 'failure' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1378:3: otherlv_0= 'failure' otherlv_1= '[' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleOnProcessFailure3232); 

                	newLeafNode(otherlv_0, grammarAccess.getOnProcessFailureAccess().getFailureKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleOnProcessFailure3244); 

                	newLeafNode(otherlv_1, grammarAccess.getOnProcessFailureAccess().getLeftSquareBracketKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1386:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1387:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1387:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1388:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOnProcessFailureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOnProcessFailureAccess().getResultsEntityStateCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleOnProcessFailure3267);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1401:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1401:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOnProcessFailure3280); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOnProcessFailureAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1405:1: ( ( ruleQualifiedName ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1406:1: ( ruleQualifiedName )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1406:1: ( ruleQualifiedName )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1407:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOnProcessFailureRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getOnProcessFailureAccess().getResultsEntityStateCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleOnProcessFailure3303);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleOnProcessFailure3317); 

                	newLeafNode(otherlv_5, grammarAccess.getOnProcessFailureAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnProcessFailure"


    // $ANTLR start "entryRuleWorkflow"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1432:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1433:2: (iv_ruleWorkflow= ruleWorkflow EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1434:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_ruleWorkflow_in_entryRuleWorkflow3353);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflow3363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1441:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>' )? ( (lv_roles_7_0= ruleWorkflowRoles ) ) ( (lv_contents_8_0= ruleWorkflowBlock ) ) ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_variants_3_0 = null;

        EObject lv_variants_5_0 = null;

        EObject lv_roles_7_0 = null;

        EObject lv_contents_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1444:28: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>' )? ( (lv_roles_7_0= ruleWorkflowRoles ) ) ( (lv_contents_8_0= ruleWorkflowBlock ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1445:1: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>' )? ( (lv_roles_7_0= ruleWorkflowRoles ) ) ( (lv_contents_8_0= ruleWorkflowBlock ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1445:1: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>' )? ( (lv_roles_7_0= ruleWorkflowRoles ) ) ( (lv_contents_8_0= ruleWorkflowBlock ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1445:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>' )? ( (lv_roles_7_0= ruleWorkflowRoles ) ) ( (lv_contents_8_0= ruleWorkflowBlock ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleWorkflow3400); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1449:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1450:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1450:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1451:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkflow3417); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1467:2: (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1467:4: otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWorkflow3435); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLessThanSignKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1471:1: ( (lv_variants_3_0= ruleWorkflowVariant ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1472:1: (lv_variants_3_0= ruleWorkflowVariant )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1472:1: (lv_variants_3_0= ruleWorkflowVariant )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1473:3: lv_variants_3_0= ruleWorkflowVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkflowAccess().getVariantsWorkflowVariantParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWorkflowVariant_in_ruleWorkflow3456);
                    lv_variants_3_0=ruleWorkflowVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"WorkflowVariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1489:2: (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==20) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1489:4: otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariant ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleWorkflow3469); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getWorkflowAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1493:1: ( (lv_variants_5_0= ruleWorkflowVariant ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1494:1: (lv_variants_5_0= ruleWorkflowVariant )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1494:1: (lv_variants_5_0= ruleWorkflowVariant )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1495:3: lv_variants_5_0= ruleWorkflowVariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkflowAccess().getVariantsWorkflowVariantParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkflowVariant_in_ruleWorkflow3490);
                    	    lv_variants_5_0=ruleWorkflowVariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variants",
                    	            		lv_variants_5_0, 
                    	            		"WorkflowVariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleWorkflow3504); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkflowAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1515:3: ( (lv_roles_7_0= ruleWorkflowRoles ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1516:1: (lv_roles_7_0= ruleWorkflowRoles )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1516:1: (lv_roles_7_0= ruleWorkflowRoles )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1517:3: lv_roles_7_0= ruleWorkflowRoles
            {
             
            	        newCompositeNode(grammarAccess.getWorkflowAccess().getRolesWorkflowRolesParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkflowRoles_in_ruleWorkflow3527);
            lv_roles_7_0=ruleWorkflowRoles();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	        }
                   		set(
                   			current, 
                   			"roles",
                    		lv_roles_7_0, 
                    		"WorkflowRoles");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1533:2: ( (lv_contents_8_0= ruleWorkflowBlock ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1534:1: (lv_contents_8_0= ruleWorkflowBlock )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1534:1: (lv_contents_8_0= ruleWorkflowBlock )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1535:3: lv_contents_8_0= ruleWorkflowBlock
            {
             
            	        newCompositeNode(grammarAccess.getWorkflowAccess().getContentsWorkflowBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkflowBlock_in_ruleWorkflow3548);
            lv_contents_8_0=ruleWorkflowBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	        }
                   		set(
                   			current, 
                   			"contents",
                    		lv_contents_8_0, 
                    		"WorkflowBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleWorkflowVariant"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1559:1: entryRuleWorkflowVariant returns [EObject current=null] : iv_ruleWorkflowVariant= ruleWorkflowVariant EOF ;
    public final EObject entryRuleWorkflowVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowVariant = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1560:2: (iv_ruleWorkflowVariant= ruleWorkflowVariant EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1561:2: iv_ruleWorkflowVariant= ruleWorkflowVariant EOF
            {
             newCompositeNode(grammarAccess.getWorkflowVariantRule()); 
            pushFollow(FOLLOW_ruleWorkflowVariant_in_entryRuleWorkflowVariant3584);
            iv_ruleWorkflowVariant=ruleWorkflowVariant();

            state._fsp--;

             current =iv_ruleWorkflowVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowVariant3594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowVariant"


    // $ANTLR start "ruleWorkflowVariant"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1568:1: ruleWorkflowVariant returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleWorkflowVariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1571:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1572:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1572:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1573:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1573:1: (lv_name_0_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1574:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkflowVariant3635); 

            			newLeafNode(lv_name_0_0, grammarAccess.getWorkflowVariantAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowVariantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowVariant"


    // $ANTLR start "entryRuleWorkflowRoles"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1598:1: entryRuleWorkflowRoles returns [EObject current=null] : iv_ruleWorkflowRoles= ruleWorkflowRoles EOF ;
    public final EObject entryRuleWorkflowRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRoles = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1599:2: (iv_ruleWorkflowRoles= ruleWorkflowRoles EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1600:2: iv_ruleWorkflowRoles= ruleWorkflowRoles EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRolesRule()); 
            pushFollow(FOLLOW_ruleWorkflowRoles_in_entryRuleWorkflowRoles3675);
            iv_ruleWorkflowRoles=ruleWorkflowRoles();

            state._fsp--;

             current =iv_ruleWorkflowRoles; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRoles3685); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowRoles"


    // $ANTLR start "ruleWorkflowRoles"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1607:1: ruleWorkflowRoles returns [EObject current=null] : (this_RoleDeclarations_0= ruleRoleDeclarations | this_ProcessReference_1= ruleProcessReference ) ;
    public final EObject ruleWorkflowRoles() throws RecognitionException {
        EObject current = null;

        EObject this_RoleDeclarations_0 = null;

        EObject this_ProcessReference_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1610:28: ( (this_RoleDeclarations_0= ruleRoleDeclarations | this_ProcessReference_1= ruleProcessReference ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1611:1: (this_RoleDeclarations_0= ruleRoleDeclarations | this_ProcessReference_1= ruleProcessReference )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1611:1: (this_RoleDeclarations_0= ruleRoleDeclarations | this_ProcessReference_1= ruleProcessReference )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            else if ( (LA23_0==35) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1612:5: this_RoleDeclarations_0= ruleRoleDeclarations
                    {
                     
                            newCompositeNode(grammarAccess.getWorkflowRolesAccess().getRoleDeclarationsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRoleDeclarations_in_ruleWorkflowRoles3732);
                    this_RoleDeclarations_0=ruleRoleDeclarations();

                    state._fsp--;

                     
                            current = this_RoleDeclarations_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1622:5: this_ProcessReference_1= ruleProcessReference
                    {
                     
                            newCompositeNode(grammarAccess.getWorkflowRolesAccess().getProcessReferenceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProcessReference_in_ruleWorkflowRoles3759);
                    this_ProcessReference_1=ruleProcessReference();

                    state._fsp--;

                     
                            current = this_ProcessReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowRoles"


    // $ANTLR start "entryRuleRoleDeclarations"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1638:1: entryRuleRoleDeclarations returns [EObject current=null] : iv_ruleRoleDeclarations= ruleRoleDeclarations EOF ;
    public final EObject entryRuleRoleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleDeclarations = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1639:2: (iv_ruleRoleDeclarations= ruleRoleDeclarations EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1640:2: iv_ruleRoleDeclarations= ruleRoleDeclarations EOF
            {
             newCompositeNode(grammarAccess.getRoleDeclarationsRule()); 
            pushFollow(FOLLOW_ruleRoleDeclarations_in_entryRuleRoleDeclarations3794);
            iv_ruleRoleDeclarations=ruleRoleDeclarations();

            state._fsp--;

             current =iv_ruleRoleDeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleDeclarations3804); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleDeclarations"


    // $ANTLR start "ruleRoleDeclarations"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1647:1: ruleRoleDeclarations returns [EObject current=null] : (otherlv_0= '(' ( (lv_roles_1_0= ruleWorkflowRole ) ) (otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleRoleDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_roles_1_0 = null;

        EObject lv_roles_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1650:28: ( (otherlv_0= '(' ( (lv_roles_1_0= ruleWorkflowRole ) ) (otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) ) )+ otherlv_4= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1651:1: (otherlv_0= '(' ( (lv_roles_1_0= ruleWorkflowRole ) ) (otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) ) )+ otherlv_4= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1651:1: (otherlv_0= '(' ( (lv_roles_1_0= ruleWorkflowRole ) ) (otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) ) )+ otherlv_4= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1651:3: otherlv_0= '(' ( (lv_roles_1_0= ruleWorkflowRole ) ) (otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRoleDeclarations3841); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleDeclarationsAccess().getLeftParenthesisKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1655:1: ( (lv_roles_1_0= ruleWorkflowRole ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1656:1: (lv_roles_1_0= ruleWorkflowRole )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1656:1: (lv_roles_1_0= ruleWorkflowRole )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1657:3: lv_roles_1_0= ruleWorkflowRole
            {
             
            	        newCompositeNode(grammarAccess.getRoleDeclarationsAccess().getRolesWorkflowRoleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkflowRole_in_ruleRoleDeclarations3862);
            lv_roles_1_0=ruleWorkflowRole();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoleDeclarationsRule());
            	        }
                   		add(
                   			current, 
                   			"roles",
                    		lv_roles_1_0, 
                    		"WorkflowRole");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1673:2: (otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1673:4: otherlv_2= ',' ( (lv_roles_3_0= ruleWorkflowRole ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleRoleDeclarations3875); 

            	        	newLeafNode(otherlv_2, grammarAccess.getRoleDeclarationsAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1677:1: ( (lv_roles_3_0= ruleWorkflowRole ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1678:1: (lv_roles_3_0= ruleWorkflowRole )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1678:1: (lv_roles_3_0= ruleWorkflowRole )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1679:3: lv_roles_3_0= ruleWorkflowRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleDeclarationsAccess().getRolesWorkflowRoleParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkflowRole_in_ruleRoleDeclarations3896);
            	    lv_roles_3_0=ruleWorkflowRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleDeclarationsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_3_0, 
            	            		"WorkflowRole");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRoleDeclarations3910); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleDeclarationsAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleDeclarations"


    // $ANTLR start "entryRuleWorkflowRole"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1707:1: entryRuleWorkflowRole returns [EObject current=null] : iv_ruleWorkflowRole= ruleWorkflowRole EOF ;
    public final EObject entryRuleWorkflowRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRole = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1708:2: (iv_ruleWorkflowRole= ruleWorkflowRole EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1709:2: iv_ruleWorkflowRole= ruleWorkflowRole EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRoleRule()); 
            pushFollow(FOLLOW_ruleWorkflowRole_in_entryRuleWorkflowRole3946);
            iv_ruleWorkflowRole=ruleWorkflowRole();

            state._fsp--;

             current =iv_ruleWorkflowRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRole3956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowRole"


    // $ANTLR start "ruleWorkflowRole"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1716:1: ruleWorkflowRole returns [EObject current=null] : this_Role_0= ruleRole ;
    public final EObject ruleWorkflowRole() throws RecognitionException {
        EObject current = null;

        EObject this_Role_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1719:28: (this_Role_0= ruleRole )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1721:5: this_Role_0= ruleRole
            {
             
                    newCompositeNode(grammarAccess.getWorkflowRoleAccess().getRoleParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRole_in_ruleWorkflowRole4002);
            this_Role_0=ruleRole();

            state._fsp--;

             
                    current = this_Role_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowRole"


    // $ANTLR start "entryRuleProcessReference"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1737:1: entryRuleProcessReference returns [EObject current=null] : iv_ruleProcessReference= ruleProcessReference EOF ;
    public final EObject entryRuleProcessReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessReference = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1738:2: (iv_ruleProcessReference= ruleProcessReference EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1739:2: iv_ruleProcessReference= ruleProcessReference EOF
            {
             newCompositeNode(grammarAccess.getProcessReferenceRule()); 
            pushFollow(FOLLOW_ruleProcessReference_in_entryRuleProcessReference4036);
            iv_ruleProcessReference=ruleProcessReference();

            state._fsp--;

             current =iv_ruleProcessReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessReference4046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessReference"


    // $ANTLR start "ruleProcessReference"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1746:1: ruleProcessReference returns [EObject current=null] : (otherlv_0= 'implements' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleProcessReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1749:28: ( (otherlv_0= 'implements' ( ( ruleQualifiedName ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1750:1: (otherlv_0= 'implements' ( ( ruleQualifiedName ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1750:1: (otherlv_0= 'implements' ( ( ruleQualifiedName ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1750:3: otherlv_0= 'implements' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleProcessReference4083); 

                	newLeafNode(otherlv_0, grammarAccess.getProcessReferenceAccess().getImplementsKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1754:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1755:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1755:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1756:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getProcessReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getProcessReferenceAccess().getImplementsProcessCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProcessReference4106);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessReference"


    // $ANTLR start "entryRuleWorkflowBlock"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1777:1: entryRuleWorkflowBlock returns [EObject current=null] : iv_ruleWorkflowBlock= ruleWorkflowBlock EOF ;
    public final EObject entryRuleWorkflowBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowBlock = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1778:2: (iv_ruleWorkflowBlock= ruleWorkflowBlock EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1779:2: iv_ruleWorkflowBlock= ruleWorkflowBlock EOF
            {
             newCompositeNode(grammarAccess.getWorkflowBlockRule()); 
            pushFollow(FOLLOW_ruleWorkflowBlock_in_entryRuleWorkflowBlock4142);
            iv_ruleWorkflowBlock=ruleWorkflowBlock();

            state._fsp--;

             current =iv_ruleWorkflowBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowBlock4152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowBlock"


    // $ANTLR start "ruleWorkflowBlock"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1786:1: ruleWorkflowBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_elements_1_0= ruleWorkflowElement ) )* ( (lv_elements_2_0= ruleEndPoint ) ) otherlv_3= '}' ) ;
    public final EObject ruleWorkflowBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1789:28: ( (otherlv_0= '{' ( (lv_elements_1_0= ruleWorkflowElement ) )* ( (lv_elements_2_0= ruleEndPoint ) ) otherlv_3= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1790:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleWorkflowElement ) )* ( (lv_elements_2_0= ruleEndPoint ) ) otherlv_3= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1790:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleWorkflowElement ) )* ( (lv_elements_2_0= ruleEndPoint ) ) otherlv_3= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1790:3: otherlv_0= '{' ( (lv_elements_1_0= ruleWorkflowElement ) )* ( (lv_elements_2_0= ruleEndPoint ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleWorkflowBlock4189); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkflowBlockAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1794:1: ( (lv_elements_1_0= ruleWorkflowElement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32||LA25_0==36||LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1795:1: (lv_elements_1_0= ruleWorkflowElement )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1795:1: (lv_elements_1_0= ruleWorkflowElement )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1796:3: lv_elements_1_0= ruleWorkflowElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkflowBlockAccess().getElementsWorkflowElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkflowElement_in_ruleWorkflowBlock4210);
            	    lv_elements_1_0=ruleWorkflowElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkflowBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"WorkflowElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1812:3: ( (lv_elements_2_0= ruleEndPoint ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1813:1: (lv_elements_2_0= ruleEndPoint )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1813:1: (lv_elements_2_0= ruleEndPoint )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1814:3: lv_elements_2_0= ruleEndPoint
            {
             
            	        newCompositeNode(grammarAccess.getWorkflowBlockAccess().getElementsEndPointParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEndPoint_in_ruleWorkflowBlock4232);
            lv_elements_2_0=ruleEndPoint();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkflowBlockRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"EndPoint");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleWorkflowBlock4244); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkflowBlockAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowBlock"


    // $ANTLR start "entryRuleEndPoint"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1842:1: entryRuleEndPoint returns [EObject current=null] : iv_ruleEndPoint= ruleEndPoint EOF ;
    public final EObject entryRuleEndPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndPoint = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1843:2: (iv_ruleEndPoint= ruleEndPoint EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1844:2: iv_ruleEndPoint= ruleEndPoint EOF
            {
             newCompositeNode(grammarAccess.getEndPointRule()); 
            pushFollow(FOLLOW_ruleEndPoint_in_entryRuleEndPoint4280);
            iv_ruleEndPoint=ruleEndPoint();

            state._fsp--;

             current =iv_ruleEndPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndPoint4290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndPoint"


    // $ANTLR start "ruleEndPoint"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1851:1: ruleEndPoint returns [EObject current=null] : ( ( (lv_name_0_0= 'success' ) ) | ( (lv_name_1_0= 'failure' ) ) ) ;
    public final EObject ruleEndPoint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1854:28: ( ( ( (lv_name_0_0= 'success' ) ) | ( (lv_name_1_0= 'failure' ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1855:1: ( ( (lv_name_0_0= 'success' ) ) | ( (lv_name_1_0= 'failure' ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1855:1: ( ( (lv_name_0_0= 'success' ) ) | ( (lv_name_1_0= 'failure' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            else if ( (LA26_0==31) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1855:2: ( (lv_name_0_0= 'success' ) )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1855:2: ( (lv_name_0_0= 'success' ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1856:1: (lv_name_0_0= 'success' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1856:1: (lv_name_0_0= 'success' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1857:3: lv_name_0_0= 'success'
                    {
                    lv_name_0_0=(Token)match(input,30,FOLLOW_30_in_ruleEndPoint4333); 

                            newLeafNode(lv_name_0_0, grammarAccess.getEndPointAccess().getNameSuccessKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEndPointRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "success");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1871:6: ( (lv_name_1_0= 'failure' ) )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1871:6: ( (lv_name_1_0= 'failure' ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1872:1: (lv_name_1_0= 'failure' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1872:1: (lv_name_1_0= 'failure' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1873:3: lv_name_1_0= 'failure'
                    {
                    lv_name_1_0=(Token)match(input,31,FOLLOW_31_in_ruleEndPoint4370); 

                            newLeafNode(lv_name_1_0, grammarAccess.getEndPointAccess().getNameFailureKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEndPointRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "failure");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndPoint"


    // $ANTLR start "entryRuleWorkflowElement"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1894:1: entryRuleWorkflowElement returns [EObject current=null] : iv_ruleWorkflowElement= ruleWorkflowElement EOF ;
    public final EObject entryRuleWorkflowElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowElement = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1895:2: (iv_ruleWorkflowElement= ruleWorkflowElement EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1896:2: iv_ruleWorkflowElement= ruleWorkflowElement EOF
            {
             newCompositeNode(grammarAccess.getWorkflowElementRule()); 
            pushFollow(FOLLOW_ruleWorkflowElement_in_entryRuleWorkflowElement4419);
            iv_ruleWorkflowElement=ruleWorkflowElement();

            state._fsp--;

             current =iv_ruleWorkflowElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowElement4429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowElement"


    // $ANTLR start "ruleWorkflowElement"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1903:1: ruleWorkflowElement returns [EObject current=null] : (this_WorkflowBranch_0= ruleWorkflowBranch | this_WorkflowAction_1= ruleWorkflowAction ) ;
    public final EObject ruleWorkflowElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkflowBranch_0 = null;

        EObject this_WorkflowAction_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1906:28: ( (this_WorkflowBranch_0= ruleWorkflowBranch | this_WorkflowAction_1= ruleWorkflowAction ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1907:1: (this_WorkflowBranch_0= ruleWorkflowBranch | this_WorkflowAction_1= ruleWorkflowAction )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1907:1: (this_WorkflowBranch_0= ruleWorkflowBranch | this_WorkflowAction_1= ruleWorkflowAction )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            else if ( (LA27_0==32||LA27_0==38) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1908:5: this_WorkflowBranch_0= ruleWorkflowBranch
                    {
                     
                            newCompositeNode(grammarAccess.getWorkflowElementAccess().getWorkflowBranchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWorkflowBranch_in_ruleWorkflowElement4476);
                    this_WorkflowBranch_0=ruleWorkflowBranch();

                    state._fsp--;

                     
                            current = this_WorkflowBranch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1918:5: this_WorkflowAction_1= ruleWorkflowAction
                    {
                     
                            newCompositeNode(grammarAccess.getWorkflowElementAccess().getWorkflowActionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWorkflowAction_in_ruleWorkflowElement4503);
                    this_WorkflowAction_1=ruleWorkflowAction();

                    state._fsp--;

                     
                            current = this_WorkflowAction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowElement"


    // $ANTLR start "entryRuleWorkflowBranch"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1934:1: entryRuleWorkflowBranch returns [EObject current=null] : iv_ruleWorkflowBranch= ruleWorkflowBranch EOF ;
    public final EObject entryRuleWorkflowBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowBranch = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1935:2: (iv_ruleWorkflowBranch= ruleWorkflowBranch EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1936:2: iv_ruleWorkflowBranch= ruleWorkflowBranch EOF
            {
             newCompositeNode(grammarAccess.getWorkflowBranchRule()); 
            pushFollow(FOLLOW_ruleWorkflowBranch_in_entryRuleWorkflowBranch4538);
            iv_ruleWorkflowBranch=ruleWorkflowBranch();

            state._fsp--;

             current =iv_ruleWorkflowBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowBranch4548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowBranch"


    // $ANTLR start "ruleWorkflowBranch"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1943:1: ruleWorkflowBranch returns [EObject current=null] : (otherlv_0= 'branch' otherlv_1= '{' ( (lv_conditions_2_0= ruleBranchCondition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleWorkflowBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_conditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1946:28: ( (otherlv_0= 'branch' otherlv_1= '{' ( (lv_conditions_2_0= ruleBranchCondition ) )+ otherlv_3= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1947:1: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_conditions_2_0= ruleBranchCondition ) )+ otherlv_3= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1947:1: (otherlv_0= 'branch' otherlv_1= '{' ( (lv_conditions_2_0= ruleBranchCondition ) )+ otherlv_3= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1947:3: otherlv_0= 'branch' otherlv_1= '{' ( (lv_conditions_2_0= ruleBranchCondition ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleWorkflowBranch4585); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkflowBranchAccess().getBranchKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleWorkflowBranch4597); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkflowBranchAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1955:1: ( (lv_conditions_2_0= ruleBranchCondition ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1956:1: (lv_conditions_2_0= ruleBranchCondition )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1956:1: (lv_conditions_2_0= ruleBranchCondition )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1957:3: lv_conditions_2_0= ruleBranchCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkflowBranchAccess().getConditionsBranchConditionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBranchCondition_in_ruleWorkflowBranch4618);
            	    lv_conditions_2_0=ruleBranchCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkflowBranchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_2_0, 
            	            		"BranchCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleWorkflowBranch4631); 

                	newLeafNode(otherlv_3, grammarAccess.getWorkflowBranchAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowBranch"


    // $ANTLR start "entryRuleBranchCondition"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1985:1: entryRuleBranchCondition returns [EObject current=null] : iv_ruleBranchCondition= ruleBranchCondition EOF ;
    public final EObject entryRuleBranchCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchCondition = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1986:2: (iv_ruleBranchCondition= ruleBranchCondition EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1987:2: iv_ruleBranchCondition= ruleBranchCondition EOF
            {
             newCompositeNode(grammarAccess.getBranchConditionRule()); 
            pushFollow(FOLLOW_ruleBranchCondition_in_entryRuleBranchCondition4667);
            iv_ruleBranchCondition=ruleBranchCondition();

            state._fsp--;

             current =iv_ruleBranchCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchCondition4677); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranchCondition"


    // $ANTLR start "ruleBranchCondition"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1994:1: ruleBranchCondition returns [EObject current=null] : (otherlv_0= 'condition' otherlv_1= '(' ruleBooleanExpression otherlv_3= ')' ( (lv_contents_4_0= ruleWorkflowBlock ) ) ) ;
    public final EObject ruleBranchCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_contents_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1997:28: ( (otherlv_0= 'condition' otherlv_1= '(' ruleBooleanExpression otherlv_3= ')' ( (lv_contents_4_0= ruleWorkflowBlock ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1998:1: (otherlv_0= 'condition' otherlv_1= '(' ruleBooleanExpression otherlv_3= ')' ( (lv_contents_4_0= ruleWorkflowBlock ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1998:1: (otherlv_0= 'condition' otherlv_1= '(' ruleBooleanExpression otherlv_3= ')' ( (lv_contents_4_0= ruleWorkflowBlock ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:1998:3: otherlv_0= 'condition' otherlv_1= '(' ruleBooleanExpression otherlv_3= ')' ( (lv_contents_4_0= ruleWorkflowBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleBranchCondition4714); 

                	newLeafNode(otherlv_0, grammarAccess.getBranchConditionAccess().getConditionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleBranchCondition4726); 

                	newLeafNode(otherlv_1, grammarAccess.getBranchConditionAccess().getLeftParenthesisKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getBranchConditionAccess().getBooleanExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleBranchCondition4742);
            ruleBooleanExpression();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleBranchCondition4753); 

                	newLeafNode(otherlv_3, grammarAccess.getBranchConditionAccess().getRightParenthesisKeyword_3());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2018:1: ( (lv_contents_4_0= ruleWorkflowBlock ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2019:1: (lv_contents_4_0= ruleWorkflowBlock )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2019:1: (lv_contents_4_0= ruleWorkflowBlock )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2020:3: lv_contents_4_0= ruleWorkflowBlock
            {
             
            	        newCompositeNode(grammarAccess.getBranchConditionAccess().getContentsWorkflowBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkflowBlock_in_ruleBranchCondition4774);
            lv_contents_4_0=ruleWorkflowBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBranchConditionRule());
            	        }
                   		set(
                   			current, 
                   			"contents",
                    		lv_contents_4_0, 
                    		"WorkflowBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranchCondition"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2044:1: entryRuleBooleanExpression returns [String current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final String entryRuleBooleanExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanExpression = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2045:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2046:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression4811);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression4822); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2053:1: ruleBooleanExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleBooleanExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2056:28: (this_STRING_0= RULE_STRING )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2057:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBooleanExpression4861); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getBooleanExpressionAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleWorkflowAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2072:1: entryRuleWorkflowAction returns [EObject current=null] : iv_ruleWorkflowAction= ruleWorkflowAction EOF ;
    public final EObject entryRuleWorkflowAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowAction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2073:2: (iv_ruleWorkflowAction= ruleWorkflowAction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2074:2: iv_ruleWorkflowAction= ruleWorkflowAction EOF
            {
             newCompositeNode(grammarAccess.getWorkflowActionRule()); 
            pushFollow(FOLLOW_ruleWorkflowAction_in_entryRuleWorkflowAction4905);
            iv_ruleWorkflowAction=ruleWorkflowAction();

            state._fsp--;

             current =iv_ruleWorkflowAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowAction4915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowAction"


    // $ANTLR start "ruleWorkflowAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2081:1: ruleWorkflowAction returns [EObject current=null] : (this_TransactionCall_0= ruleTransactionCall | this_WorkflowCall_1= ruleWorkflowCall ) ;
    public final EObject ruleWorkflowAction() throws RecognitionException {
        EObject current = null;

        EObject this_TransactionCall_0 = null;

        EObject this_WorkflowCall_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2084:28: ( (this_TransactionCall_0= ruleTransactionCall | this_WorkflowCall_1= ruleWorkflowCall ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2085:1: (this_TransactionCall_0= ruleTransactionCall | this_WorkflowCall_1= ruleWorkflowCall )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2085:1: (this_TransactionCall_0= ruleTransactionCall | this_WorkflowCall_1= ruleWorkflowCall )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2086:5: this_TransactionCall_0= ruleTransactionCall
                    {
                     
                            newCompositeNode(grammarAccess.getWorkflowActionAccess().getTransactionCallParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTransactionCall_in_ruleWorkflowAction4962);
                    this_TransactionCall_0=ruleTransactionCall();

                    state._fsp--;

                     
                            current = this_TransactionCall_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2096:5: this_WorkflowCall_1= ruleWorkflowCall
                    {
                     
                            newCompositeNode(grammarAccess.getWorkflowActionAccess().getWorkflowCallParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleWorkflowCall_in_ruleWorkflowAction4989);
                    this_WorkflowCall_1=ruleWorkflowCall();

                    state._fsp--;

                     
                            current = this_WorkflowCall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowAction"


    // $ANTLR start "entryRuleTransactionCall"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2112:1: entryRuleTransactionCall returns [EObject current=null] : iv_ruleTransactionCall= ruleTransactionCall EOF ;
    public final EObject entryRuleTransactionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionCall = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2113:2: (iv_ruleTransactionCall= ruleTransactionCall EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2114:2: iv_ruleTransactionCall= ruleTransactionCall EOF
            {
             newCompositeNode(grammarAccess.getTransactionCallRule()); 
            pushFollow(FOLLOW_ruleTransactionCall_in_entryRuleTransactionCall5024);
            iv_ruleTransactionCall=ruleTransactionCall();

            state._fsp--;

             current =iv_ruleTransactionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionCall5034); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransactionCall"


    // $ANTLR start "ruleTransactionCall"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2121:1: ruleTransactionCall returns [EObject current=null] : (otherlv_0= 'transaction' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_sender_8_0= ruleSenderRoleMapping ) ) otherlv_9= ',' ( (lv_receiver_10_0= ruleReceiverRoleMapping ) ) otherlv_11= ')' ) ;
    public final EObject ruleTransactionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_variants_3_0 = null;

        EObject lv_variants_5_0 = null;

        EObject lv_sender_8_0 = null;

        EObject lv_receiver_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2124:28: ( (otherlv_0= 'transaction' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_sender_8_0= ruleSenderRoleMapping ) ) otherlv_9= ',' ( (lv_receiver_10_0= ruleReceiverRoleMapping ) ) otherlv_11= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2125:1: (otherlv_0= 'transaction' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_sender_8_0= ruleSenderRoleMapping ) ) otherlv_9= ',' ( (lv_receiver_10_0= ruleReceiverRoleMapping ) ) otherlv_11= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2125:1: (otherlv_0= 'transaction' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_sender_8_0= ruleSenderRoleMapping ) ) otherlv_9= ',' ( (lv_receiver_10_0= ruleReceiverRoleMapping ) ) otherlv_11= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2125:3: otherlv_0= 'transaction' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_sender_8_0= ruleSenderRoleMapping ) ) otherlv_9= ',' ( (lv_receiver_10_0= ruleReceiverRoleMapping ) ) otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTransactionCall5071); 

                	newLeafNode(otherlv_0, grammarAccess.getTransactionCallAccess().getTransactionKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2129:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2130:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2130:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2131:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransactionCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransactionCallAccess().getNameTransactionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransactionCall5094);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2144:2: (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2144:4: otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTransactionCall5107); 

                        	newLeafNode(otherlv_2, grammarAccess.getTransactionCallAccess().getLessThanSignKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2148:1: ( (lv_variants_3_0= ruleTransactionVariantMapping ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2149:1: (lv_variants_3_0= ruleTransactionVariantMapping )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2149:1: (lv_variants_3_0= ruleTransactionVariantMapping )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2150:3: lv_variants_3_0= ruleTransactionVariantMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransactionCallAccess().getVariantsTransactionVariantMappingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTransactionVariantMapping_in_ruleTransactionCall5128);
                    lv_variants_3_0=ruleTransactionVariantMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransactionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"TransactionVariantMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2166:2: (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==20) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2166:4: otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariantMapping ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTransactionCall5141); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTransactionCallAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2170:1: ( (lv_variants_5_0= ruleTransactionVariantMapping ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2171:1: (lv_variants_5_0= ruleTransactionVariantMapping )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2171:1: (lv_variants_5_0= ruleTransactionVariantMapping )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2172:3: lv_variants_5_0= ruleTransactionVariantMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransactionCallAccess().getVariantsTransactionVariantMappingParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransactionVariantMapping_in_ruleTransactionCall5162);
                    	    lv_variants_5_0=ruleTransactionVariantMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransactionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variants",
                    	            		lv_variants_5_0, 
                    	            		"TransactionVariantMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleTransactionCall5176); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransactionCallAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTransactionCall5190); 

                	newLeafNode(otherlv_7, grammarAccess.getTransactionCallAccess().getLeftParenthesisKeyword_3());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2196:1: ( (lv_sender_8_0= ruleSenderRoleMapping ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2197:1: (lv_sender_8_0= ruleSenderRoleMapping )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2197:1: (lv_sender_8_0= ruleSenderRoleMapping )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2198:3: lv_sender_8_0= ruleSenderRoleMapping
            {
             
            	        newCompositeNode(grammarAccess.getTransactionCallAccess().getSenderSenderRoleMappingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSenderRoleMapping_in_ruleTransactionCall5211);
            lv_sender_8_0=ruleSenderRoleMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransactionCallRule());
            	        }
                   		set(
                   			current, 
                   			"sender",
                    		lv_sender_8_0, 
                    		"SenderRoleMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleTransactionCall5223); 

                	newLeafNode(otherlv_9, grammarAccess.getTransactionCallAccess().getCommaKeyword_5());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2218:1: ( (lv_receiver_10_0= ruleReceiverRoleMapping ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2219:1: (lv_receiver_10_0= ruleReceiverRoleMapping )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2219:1: (lv_receiver_10_0= ruleReceiverRoleMapping )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2220:3: lv_receiver_10_0= ruleReceiverRoleMapping
            {
             
            	        newCompositeNode(grammarAccess.getTransactionCallAccess().getReceiverReceiverRoleMappingParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleReceiverRoleMapping_in_ruleTransactionCall5244);
            lv_receiver_10_0=ruleReceiverRoleMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransactionCallRule());
            	        }
                   		set(
                   			current, 
                   			"receiver",
                    		lv_receiver_10_0, 
                    		"ReceiverRoleMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleTransactionCall5256); 

                	newLeafNode(otherlv_11, grammarAccess.getTransactionCallAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransactionCall"


    // $ANTLR start "entryRuleTransactionVariantMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2248:1: entryRuleTransactionVariantMapping returns [EObject current=null] : iv_ruleTransactionVariantMapping= ruleTransactionVariantMapping EOF ;
    public final EObject entryRuleTransactionVariantMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionVariantMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2249:2: (iv_ruleTransactionVariantMapping= ruleTransactionVariantMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2250:2: iv_ruleTransactionVariantMapping= ruleTransactionVariantMapping EOF
            {
             newCompositeNode(grammarAccess.getTransactionVariantMappingRule()); 
            pushFollow(FOLLOW_ruleTransactionVariantMapping_in_entryRuleTransactionVariantMapping5292);
            iv_ruleTransactionVariantMapping=ruleTransactionVariantMapping();

            state._fsp--;

             current =iv_ruleTransactionVariantMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionVariantMapping5302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransactionVariantMapping"


    // $ANTLR start "ruleTransactionVariantMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2257:1: ruleTransactionVariantMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransactionVariantMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2260:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2261:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2261:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2261:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2261:2: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2262:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2262:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2263:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransactionVariantMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransactionVariantMappingAccess().getParameterTransactionVariantCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransactionVariantMapping5350);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleTransactionVariantMapping5362); 

                	newLeafNode(otherlv_1, grammarAccess.getTransactionVariantMappingAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2280:1: ( (otherlv_2= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2281:1: (otherlv_2= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2281:1: (otherlv_2= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2282:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransactionVariantMappingRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransactionVariantMapping5382); 

            		newLeafNode(otherlv_2, grammarAccess.getTransactionVariantMappingAccess().getValueWorkflowVariantCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransactionVariantMapping"


    // $ANTLR start "entryRuleSenderRoleMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2301:1: entryRuleSenderRoleMapping returns [EObject current=null] : iv_ruleSenderRoleMapping= ruleSenderRoleMapping EOF ;
    public final EObject entryRuleSenderRoleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderRoleMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2302:2: (iv_ruleSenderRoleMapping= ruleSenderRoleMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2303:2: iv_ruleSenderRoleMapping= ruleSenderRoleMapping EOF
            {
             newCompositeNode(grammarAccess.getSenderRoleMappingRule()); 
            pushFollow(FOLLOW_ruleSenderRoleMapping_in_entryRuleSenderRoleMapping5418);
            iv_ruleSenderRoleMapping=ruleSenderRoleMapping();

            state._fsp--;

             current =iv_ruleSenderRoleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSenderRoleMapping5428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSenderRoleMapping"


    // $ANTLR start "ruleSenderRoleMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2310:1: ruleSenderRoleMapping returns [EObject current=null] : ( ( (lv_parameter_0_0= 'sender' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleSenderRoleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2313:28: ( ( ( (lv_parameter_0_0= 'sender' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2314:1: ( ( (lv_parameter_0_0= 'sender' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2314:1: ( ( (lv_parameter_0_0= 'sender' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2314:2: ( (lv_parameter_0_0= 'sender' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2314:2: ( (lv_parameter_0_0= 'sender' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2315:1: (lv_parameter_0_0= 'sender' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2315:1: (lv_parameter_0_0= 'sender' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2316:3: lv_parameter_0_0= 'sender'
            {
            lv_parameter_0_0=(Token)match(input,40,FOLLOW_40_in_ruleSenderRoleMapping5471); 

                    newLeafNode(lv_parameter_0_0, grammarAccess.getSenderRoleMappingAccess().getParameterSenderKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSenderRoleMappingRule());
            	        }
                   		setWithLastConsumed(current, "parameter", lv_parameter_0_0, "sender");
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleSenderRoleMapping5496); 

                	newLeafNode(otherlv_1, grammarAccess.getSenderRoleMappingAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2333:1: ( (otherlv_2= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2334:1: (otherlv_2= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2334:1: (otherlv_2= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2335:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSenderRoleMappingRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSenderRoleMapping5516); 

            		newLeafNode(otherlv_2, grammarAccess.getSenderRoleMappingAccess().getValueWorkflowRoleCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSenderRoleMapping"


    // $ANTLR start "entryRuleReceiverRoleMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2354:1: entryRuleReceiverRoleMapping returns [EObject current=null] : iv_ruleReceiverRoleMapping= ruleReceiverRoleMapping EOF ;
    public final EObject entryRuleReceiverRoleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverRoleMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2355:2: (iv_ruleReceiverRoleMapping= ruleReceiverRoleMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2356:2: iv_ruleReceiverRoleMapping= ruleReceiverRoleMapping EOF
            {
             newCompositeNode(grammarAccess.getReceiverRoleMappingRule()); 
            pushFollow(FOLLOW_ruleReceiverRoleMapping_in_entryRuleReceiverRoleMapping5552);
            iv_ruleReceiverRoleMapping=ruleReceiverRoleMapping();

            state._fsp--;

             current =iv_ruleReceiverRoleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReceiverRoleMapping5562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiverRoleMapping"


    // $ANTLR start "ruleReceiverRoleMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2363:1: ruleReceiverRoleMapping returns [EObject current=null] : ( ( (lv_parameter_0_0= 'receiver' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleReceiverRoleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2366:28: ( ( ( (lv_parameter_0_0= 'receiver' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2367:1: ( ( (lv_parameter_0_0= 'receiver' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2367:1: ( ( (lv_parameter_0_0= 'receiver' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2367:2: ( (lv_parameter_0_0= 'receiver' ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2367:2: ( (lv_parameter_0_0= 'receiver' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2368:1: (lv_parameter_0_0= 'receiver' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2368:1: (lv_parameter_0_0= 'receiver' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2369:3: lv_parameter_0_0= 'receiver'
            {
            lv_parameter_0_0=(Token)match(input,41,FOLLOW_41_in_ruleReceiverRoleMapping5605); 

                    newLeafNode(lv_parameter_0_0, grammarAccess.getReceiverRoleMappingAccess().getParameterReceiverKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReceiverRoleMappingRule());
            	        }
                   		setWithLastConsumed(current, "parameter", lv_parameter_0_0, "receiver");
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleReceiverRoleMapping5630); 

                	newLeafNode(otherlv_1, grammarAccess.getReceiverRoleMappingAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2386:1: ( (otherlv_2= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2387:1: (otherlv_2= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2387:1: (otherlv_2= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2388:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReceiverRoleMappingRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReceiverRoleMapping5650); 

            		newLeafNode(otherlv_2, grammarAccess.getReceiverRoleMappingAccess().getValueWorkflowRoleCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiverRoleMapping"


    // $ANTLR start "entryRuleWorkflowCall"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2407:1: entryRuleWorkflowCall returns [EObject current=null] : iv_ruleWorkflowCall= ruleWorkflowCall EOF ;
    public final EObject entryRuleWorkflowCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowCall = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2408:2: (iv_ruleWorkflowCall= ruleWorkflowCall EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2409:2: iv_ruleWorkflowCall= ruleWorkflowCall EOF
            {
             newCompositeNode(grammarAccess.getWorkflowCallRule()); 
            pushFollow(FOLLOW_ruleWorkflowCall_in_entryRuleWorkflowCall5686);
            iv_ruleWorkflowCall=ruleWorkflowCall();

            state._fsp--;

             current =iv_ruleWorkflowCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowCall5696); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowCall"


    // $ANTLR start "ruleWorkflowCall"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2416:1: ruleWorkflowCall returns [EObject current=null] : (otherlv_0= 'workflow' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_roles_8_0= ruleWorkflowRoleMapping ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) ) )+ otherlv_11= ')' ) ;
    public final EObject ruleWorkflowCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_variants_3_0 = null;

        EObject lv_variants_5_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_roles_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2419:28: ( (otherlv_0= 'workflow' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_roles_8_0= ruleWorkflowRoleMapping ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) ) )+ otherlv_11= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2420:1: (otherlv_0= 'workflow' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_roles_8_0= ruleWorkflowRoleMapping ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) ) )+ otherlv_11= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2420:1: (otherlv_0= 'workflow' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_roles_8_0= ruleWorkflowRoleMapping ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) ) )+ otherlv_11= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2420:3: otherlv_0= 'workflow' ( ( ruleQualifiedName ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>' )? otherlv_7= '(' ( (lv_roles_8_0= ruleWorkflowRoleMapping ) ) (otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) ) )+ otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleWorkflowCall5733); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkflowCallAccess().getWorkflowKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2424:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2425:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2425:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2426:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowCallRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWorkflowCallAccess().getNameWorkflowCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWorkflowCall5756);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2439:2: (otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2439:4: otherlv_2= '<' ( (lv_variants_3_0= ruleWorkflowVariantMapping ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleWorkflowCall5769); 

                        	newLeafNode(otherlv_2, grammarAccess.getWorkflowCallAccess().getLessThanSignKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2443:1: ( (lv_variants_3_0= ruleWorkflowVariantMapping ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2444:1: (lv_variants_3_0= ruleWorkflowVariantMapping )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2444:1: (lv_variants_3_0= ruleWorkflowVariantMapping )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2445:3: lv_variants_3_0= ruleWorkflowVariantMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getWorkflowCallAccess().getVariantsWorkflowVariantMappingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWorkflowVariantMapping_in_ruleWorkflowCall5790);
                    lv_variants_3_0=ruleWorkflowVariantMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWorkflowCallRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"WorkflowVariantMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2461:2: (otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==20) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2461:4: otherlv_4= ',' ( (lv_variants_5_0= ruleWorkflowVariantMapping ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleWorkflowCall5803); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getWorkflowCallAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2465:1: ( (lv_variants_5_0= ruleWorkflowVariantMapping ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2466:1: (lv_variants_5_0= ruleWorkflowVariantMapping )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2466:1: (lv_variants_5_0= ruleWorkflowVariantMapping )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2467:3: lv_variants_5_0= ruleWorkflowVariantMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWorkflowCallAccess().getVariantsWorkflowVariantMappingParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleWorkflowVariantMapping_in_ruleWorkflowCall5824);
                    	    lv_variants_5_0=ruleWorkflowVariantMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWorkflowCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variants",
                    	            		lv_variants_5_0, 
                    	            		"WorkflowVariantMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleWorkflowCall5838); 

                        	newLeafNode(otherlv_6, grammarAccess.getWorkflowCallAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleWorkflowCall5852); 

                	newLeafNode(otherlv_7, grammarAccess.getWorkflowCallAccess().getLeftParenthesisKeyword_3());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2491:1: ( (lv_roles_8_0= ruleWorkflowRoleMapping ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2492:1: (lv_roles_8_0= ruleWorkflowRoleMapping )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2492:1: (lv_roles_8_0= ruleWorkflowRoleMapping )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2493:3: lv_roles_8_0= ruleWorkflowRoleMapping
            {
             
            	        newCompositeNode(grammarAccess.getWorkflowCallAccess().getRolesWorkflowRoleMappingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleWorkflowRoleMapping_in_ruleWorkflowCall5873);
            lv_roles_8_0=ruleWorkflowRoleMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkflowCallRule());
            	        }
                   		add(
                   			current, 
                   			"roles",
                    		lv_roles_8_0, 
                    		"WorkflowRoleMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2509:2: (otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2509:4: otherlv_9= ',' ( (lv_roles_10_0= ruleWorkflowRoleMapping ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleWorkflowCall5886); 

            	        	newLeafNode(otherlv_9, grammarAccess.getWorkflowCallAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2513:1: ( (lv_roles_10_0= ruleWorkflowRoleMapping ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2514:1: (lv_roles_10_0= ruleWorkflowRoleMapping )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2514:1: (lv_roles_10_0= ruleWorkflowRoleMapping )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2515:3: lv_roles_10_0= ruleWorkflowRoleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkflowCallAccess().getRolesWorkflowRoleMappingParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkflowRoleMapping_in_ruleWorkflowCall5907);
            	    lv_roles_10_0=ruleWorkflowRoleMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkflowCallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_10_0, 
            	            		"WorkflowRoleMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleWorkflowCall5921); 

                	newLeafNode(otherlv_11, grammarAccess.getWorkflowCallAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowCall"


    // $ANTLR start "entryRuleWorkflowVariantMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2543:1: entryRuleWorkflowVariantMapping returns [EObject current=null] : iv_ruleWorkflowVariantMapping= ruleWorkflowVariantMapping EOF ;
    public final EObject entryRuleWorkflowVariantMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowVariantMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2544:2: (iv_ruleWorkflowVariantMapping= ruleWorkflowVariantMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2545:2: iv_ruleWorkflowVariantMapping= ruleWorkflowVariantMapping EOF
            {
             newCompositeNode(grammarAccess.getWorkflowVariantMappingRule()); 
            pushFollow(FOLLOW_ruleWorkflowVariantMapping_in_entryRuleWorkflowVariantMapping5957);
            iv_ruleWorkflowVariantMapping=ruleWorkflowVariantMapping();

            state._fsp--;

             current =iv_ruleWorkflowVariantMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowVariantMapping5967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowVariantMapping"


    // $ANTLR start "ruleWorkflowVariantMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2552:1: ruleWorkflowVariantMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWorkflowVariantMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2555:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2556:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2556:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2556:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (otherlv_2= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2556:2: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2557:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2557:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2558:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowVariantMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWorkflowVariantMappingAccess().getParameterWorkflowVariantCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWorkflowVariantMapping6015);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleWorkflowVariantMapping6027); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkflowVariantMappingAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2575:1: ( (otherlv_2= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2576:1: (otherlv_2= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2576:1: (otherlv_2= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2577:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowVariantMappingRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkflowVariantMapping6047); 

            		newLeafNode(otherlv_2, grammarAccess.getWorkflowVariantMappingAccess().getValueWorkflowVariantCrossReference_2_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowVariantMapping"


    // $ANTLR start "entryRuleWorkflowRoleMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2596:1: entryRuleWorkflowRoleMapping returns [EObject current=null] : iv_ruleWorkflowRoleMapping= ruleWorkflowRoleMapping EOF ;
    public final EObject entryRuleWorkflowRoleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowRoleMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2597:2: (iv_ruleWorkflowRoleMapping= ruleWorkflowRoleMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2598:2: iv_ruleWorkflowRoleMapping= ruleWorkflowRoleMapping EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRoleMappingRule()); 
            pushFollow(FOLLOW_ruleWorkflowRoleMapping_in_entryRuleWorkflowRoleMapping6083);
            iv_ruleWorkflowRoleMapping=ruleWorkflowRoleMapping();

            state._fsp--;

             current =iv_ruleWorkflowRoleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkflowRoleMapping6093); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowRoleMapping"


    // $ANTLR start "ruleWorkflowRoleMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2605:1: ruleWorkflowRoleMapping returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleWorkflowRoleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2608:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2609:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2609:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2609:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( ruleQualifiedName ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2609:2: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2610:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2610:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2611:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowRoleMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWorkflowRoleMappingAccess().getParameterWorkflowRoleCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWorkflowRoleMapping6141);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleWorkflowRoleMapping6153); 

                	newLeafNode(otherlv_1, grammarAccess.getWorkflowRoleMappingAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2628:1: ( ( ruleQualifiedName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2629:1: ( ruleQualifiedName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2629:1: ( ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2630:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkflowRoleMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWorkflowRoleMappingAccess().getValueWorkflowRoleReferenceCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWorkflowRoleMapping6176);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowRoleMapping"


    // $ANTLR start "entryRuleTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2653:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2654:2: (iv_ruleTransaction= ruleTransaction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2655:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction6214);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction6224); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2662:1: ruleTransaction returns [EObject current=null] : (this_InformTransaction_0= ruleInformTransaction | this_NotifyTransaction_1= ruleNotifyTransaction | this_RequestTransaction_2= ruleRequestTransaction ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        EObject this_InformTransaction_0 = null;

        EObject this_NotifyTransaction_1 = null;

        EObject this_RequestTransaction_2 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2665:28: ( (this_InformTransaction_0= ruleInformTransaction | this_NotifyTransaction_1= ruleNotifyTransaction | this_RequestTransaction_2= ruleRequestTransaction ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2666:1: (this_InformTransaction_0= ruleInformTransaction | this_NotifyTransaction_1= ruleNotifyTransaction | this_RequestTransaction_2= ruleRequestTransaction )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2666:1: (this_InformTransaction_0= ruleInformTransaction | this_NotifyTransaction_1= ruleNotifyTransaction | this_RequestTransaction_2= ruleRequestTransaction )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt35=1;
                }
                break;
            case 48:
                {
                alt35=2;
                }
                break;
            case 54:
            case 61:
            case 62:
            case 63:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2667:5: this_InformTransaction_0= ruleInformTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getTransactionAccess().getInformTransactionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInformTransaction_in_ruleTransaction6271);
                    this_InformTransaction_0=ruleInformTransaction();

                    state._fsp--;

                     
                            current = this_InformTransaction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2677:5: this_NotifyTransaction_1= ruleNotifyTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getTransactionAccess().getNotifyTransactionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNotifyTransaction_in_ruleTransaction6298);
                    this_NotifyTransaction_1=ruleNotifyTransaction();

                    state._fsp--;

                     
                            current = this_NotifyTransaction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2687:5: this_RequestTransaction_2= ruleRequestTransaction
                    {
                     
                            newCompositeNode(grammarAccess.getTransactionAccess().getRequestTransactionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRequestTransaction_in_ruleTransaction6325);
                    this_RequestTransaction_2=ruleRequestTransaction();

                    state._fsp--;

                     
                            current = this_RequestTransaction_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleInformTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2703:1: entryRuleInformTransaction returns [EObject current=null] : iv_ruleInformTransaction= ruleInformTransaction EOF ;
    public final EObject entryRuleInformTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInformTransaction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2704:2: (iv_ruleInformTransaction= ruleInformTransaction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2705:2: iv_ruleInformTransaction= ruleInformTransaction EOF
            {
             newCompositeNode(grammarAccess.getInformTransactionRule()); 
            pushFollow(FOLLOW_ruleInformTransaction_in_entryRuleInformTransaction6360);
            iv_ruleInformTransaction=ruleInformTransaction();

            state._fsp--;

             current =iv_ruleInformTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInformTransaction6370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInformTransaction"


    // $ANTLR start "ruleInformTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2712:1: ruleInformTransaction returns [EObject current=null] : ( ( (lv_pattern_0_0= 'inform' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleDatagramAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' ) ;
    public final EObject ruleInformTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_variants_3_0 = null;

        EObject lv_variants_5_0 = null;

        EObject lv_sendAction_9_0 = null;

        EObject lv_postconditions_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2715:28: ( ( ( (lv_pattern_0_0= 'inform' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleDatagramAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2716:1: ( ( (lv_pattern_0_0= 'inform' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleDatagramAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2716:1: ( ( (lv_pattern_0_0= 'inform' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleDatagramAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2716:2: ( (lv_pattern_0_0= 'inform' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleDatagramAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}'
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2716:2: ( (lv_pattern_0_0= 'inform' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2717:1: (lv_pattern_0_0= 'inform' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2717:1: (lv_pattern_0_0= 'inform' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2718:3: lv_pattern_0_0= 'inform'
            {
            lv_pattern_0_0=(Token)match(input,42,FOLLOW_42_in_ruleInformTransaction6413); 

                    newLeafNode(lv_pattern_0_0, grammarAccess.getInformTransactionAccess().getPatternInformKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformTransactionRule());
            	        }
                   		setWithLastConsumed(current, "pattern", lv_pattern_0_0, "inform");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2731:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2732:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2732:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2733:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInformTransaction6443); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInformTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInformTransactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2749:2: (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2749:4: otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInformTransaction6461); 

                        	newLeafNode(otherlv_2, grammarAccess.getInformTransactionAccess().getLessThanSignKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2753:1: ( (lv_variants_3_0= ruleTransactionVariant ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2754:1: (lv_variants_3_0= ruleTransactionVariant )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2754:1: (lv_variants_3_0= ruleTransactionVariant )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2755:3: lv_variants_3_0= ruleTransactionVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformTransactionAccess().getVariantsTransactionVariantParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTransactionVariant_in_ruleInformTransaction6482);
                    lv_variants_3_0=ruleTransactionVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformTransactionRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"TransactionVariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2771:2: (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==20) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2771:4: otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleInformTransaction6495); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getInformTransactionAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2775:1: ( (lv_variants_5_0= ruleTransactionVariant ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2776:1: (lv_variants_5_0= ruleTransactionVariant )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2776:1: (lv_variants_5_0= ruleTransactionVariant )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2777:3: lv_variants_5_0= ruleTransactionVariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInformTransactionAccess().getVariantsTransactionVariantParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransactionVariant_in_ruleInformTransaction6516);
                    	    lv_variants_5_0=ruleTransactionVariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInformTransactionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variants",
                    	            		lv_variants_5_0, 
                    	            		"TransactionVariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleInformTransaction6530); 

                        	newLeafNode(otherlv_6, grammarAccess.getInformTransactionAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleInformTransaction6544); 

                	newLeafNode(otherlv_7, grammarAccess.getInformTransactionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleInformTransaction6556); 

                	newLeafNode(otherlv_8, grammarAccess.getInformTransactionAccess().getSendKeyword_4());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2805:1: ( (lv_sendAction_9_0= ruleDatagramAction ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2806:1: (lv_sendAction_9_0= ruleDatagramAction )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2806:1: (lv_sendAction_9_0= ruleDatagramAction )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2807:3: lv_sendAction_9_0= ruleDatagramAction
            {
             
            	        newCompositeNode(grammarAccess.getInformTransactionAccess().getSendActionDatagramActionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDatagramAction_in_ruleInformTransaction6577);
            lv_sendAction_9_0=ruleDatagramAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInformTransactionRule());
            	        }
                   		set(
                   			current, 
                   			"sendAction",
                    		lv_sendAction_9_0, 
                    		"DatagramAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2823:2: ( (lv_postconditions_10_0= rulePostconditions ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==29) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2824:1: (lv_postconditions_10_0= rulePostconditions )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2824:1: (lv_postconditions_10_0= rulePostconditions )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2825:3: lv_postconditions_10_0= rulePostconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getInformTransactionAccess().getPostconditionsPostconditionsParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_rulePostconditions_in_ruleInformTransaction6598);
                    lv_postconditions_10_0=rulePostconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInformTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"postconditions",
                            		lv_postconditions_10_0, 
                            		"Postconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleInformTransaction6611); 

                	newLeafNode(otherlv_11, grammarAccess.getInformTransactionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInformTransaction"


    // $ANTLR start "entryRuleTransactionVariant"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2853:1: entryRuleTransactionVariant returns [EObject current=null] : iv_ruleTransactionVariant= ruleTransactionVariant EOF ;
    public final EObject entryRuleTransactionVariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransactionVariant = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2854:2: (iv_ruleTransactionVariant= ruleTransactionVariant EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2855:2: iv_ruleTransactionVariant= ruleTransactionVariant EOF
            {
             newCompositeNode(grammarAccess.getTransactionVariantRule()); 
            pushFollow(FOLLOW_ruleTransactionVariant_in_entryRuleTransactionVariant6647);
            iv_ruleTransactionVariant=ruleTransactionVariant();

            state._fsp--;

             current =iv_ruleTransactionVariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransactionVariant6657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransactionVariant"


    // $ANTLR start "ruleTransactionVariant"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2862:1: ruleTransactionVariant returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTransactionVariant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2865:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2866:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2866:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2867:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2867:1: (lv_name_0_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2868:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransactionVariant6698); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTransactionVariantAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransactionVariantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransactionVariant"


    // $ANTLR start "entryRuleDatagramAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2892:1: entryRuleDatagramAction returns [EObject current=null] : iv_ruleDatagramAction= ruleDatagramAction EOF ;
    public final EObject entryRuleDatagramAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatagramAction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2893:2: (iv_ruleDatagramAction= ruleDatagramAction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2894:2: iv_ruleDatagramAction= ruleDatagramAction EOF
            {
             newCompositeNode(grammarAccess.getDatagramActionRule()); 
            pushFollow(FOLLOW_ruleDatagramAction_in_entryRuleDatagramAction6738);
            iv_ruleDatagramAction=ruleDatagramAction();

            state._fsp--;

             current =iv_ruleDatagramAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatagramAction6748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatagramAction"


    // $ANTLR start "ruleDatagramAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2901:1: ruleDatagramAction returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_messages_2_0= ruleVariantMessageMappings ) )? ( (lv_requires_3_0= ruleRequiredFeatures ) )? otherlv_4= '}' ) ;
    public final EObject ruleDatagramAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_messages_2_0 = null;

        EObject lv_requires_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2904:28: ( ( () otherlv_1= '{' ( (lv_messages_2_0= ruleVariantMessageMappings ) )? ( (lv_requires_3_0= ruleRequiredFeatures ) )? otherlv_4= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2905:1: ( () otherlv_1= '{' ( (lv_messages_2_0= ruleVariantMessageMappings ) )? ( (lv_requires_3_0= ruleRequiredFeatures ) )? otherlv_4= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2905:1: ( () otherlv_1= '{' ( (lv_messages_2_0= ruleVariantMessageMappings ) )? ( (lv_requires_3_0= ruleRequiredFeatures ) )? otherlv_4= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2905:2: () otherlv_1= '{' ( (lv_messages_2_0= ruleVariantMessageMappings ) )? ( (lv_requires_3_0= ruleRequiredFeatures ) )? otherlv_4= '}'
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2905:2: ()
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2906:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDatagramActionAccess().getDatagramActionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDatagramAction6794); 

                	newLeafNode(otherlv_1, grammarAccess.getDatagramActionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2915:1: ( (lv_messages_2_0= ruleVariantMessageMappings ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2916:1: (lv_messages_2_0= ruleVariantMessageMappings )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2916:1: (lv_messages_2_0= ruleVariantMessageMappings )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2917:3: lv_messages_2_0= ruleVariantMessageMappings
                    {
                     
                    	        newCompositeNode(grammarAccess.getDatagramActionAccess().getMessagesVariantMessageMappingsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariantMessageMappings_in_ruleDatagramAction6815);
                    lv_messages_2_0=ruleVariantMessageMappings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDatagramActionRule());
                    	        }
                           		set(
                           			current, 
                           			"messages",
                            		lv_messages_2_0, 
                            		"VariantMessageMappings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2933:3: ( (lv_requires_3_0= ruleRequiredFeatures ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2934:1: (lv_requires_3_0= ruleRequiredFeatures )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2934:1: (lv_requires_3_0= ruleRequiredFeatures )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2935:3: lv_requires_3_0= ruleRequiredFeatures
                    {
                     
                    	        newCompositeNode(grammarAccess.getDatagramActionAccess().getRequiresRequiredFeaturesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredFeatures_in_ruleDatagramAction6837);
                    lv_requires_3_0=ruleRequiredFeatures();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDatagramActionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_3_0, 
                            		"RequiredFeatures");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDatagramAction6850); 

                	newLeafNode(otherlv_4, grammarAccess.getDatagramActionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatagramAction"


    // $ANTLR start "entryRuleVariantMessageMappings"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2963:1: entryRuleVariantMessageMappings returns [EObject current=null] : iv_ruleVariantMessageMappings= ruleVariantMessageMappings EOF ;
    public final EObject entryRuleVariantMessageMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantMessageMappings = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2964:2: (iv_ruleVariantMessageMappings= ruleVariantMessageMappings EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2965:2: iv_ruleVariantMessageMappings= ruleVariantMessageMappings EOF
            {
             newCompositeNode(grammarAccess.getVariantMessageMappingsRule()); 
            pushFollow(FOLLOW_ruleVariantMessageMappings_in_entryRuleVariantMessageMappings6886);
            iv_ruleVariantMessageMappings=ruleVariantMessageMappings();

            state._fsp--;

             current =iv_ruleVariantMessageMappings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariantMessageMappings6896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariantMessageMappings"


    // $ANTLR start "ruleVariantMessageMappings"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2972:1: ruleVariantMessageMappings returns [EObject current=null] : (otherlv_0= 'messages' otherlv_1= '{' ( (lv_variants_2_0= ruleVariantMessageMapping ) ) (otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleVariantMessageMappings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_variants_2_0 = null;

        EObject lv_variants_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2975:28: ( (otherlv_0= 'messages' otherlv_1= '{' ( (lv_variants_2_0= ruleVariantMessageMapping ) ) (otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) ) )* otherlv_5= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2976:1: (otherlv_0= 'messages' otherlv_1= '{' ( (lv_variants_2_0= ruleVariantMessageMapping ) ) (otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) ) )* otherlv_5= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2976:1: (otherlv_0= 'messages' otherlv_1= '{' ( (lv_variants_2_0= ruleVariantMessageMapping ) ) (otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) ) )* otherlv_5= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2976:3: otherlv_0= 'messages' otherlv_1= '{' ( (lv_variants_2_0= ruleVariantMessageMapping ) ) (otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleVariantMessageMappings6933); 

                	newLeafNode(otherlv_0, grammarAccess.getVariantMessageMappingsAccess().getMessagesKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleVariantMessageMappings6945); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantMessageMappingsAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2984:1: ( (lv_variants_2_0= ruleVariantMessageMapping ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2985:1: (lv_variants_2_0= ruleVariantMessageMapping )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2985:1: (lv_variants_2_0= ruleVariantMessageMapping )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:2986:3: lv_variants_2_0= ruleVariantMessageMapping
            {
             
            	        newCompositeNode(grammarAccess.getVariantMessageMappingsAccess().getVariantsVariantMessageMappingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariantMessageMapping_in_ruleVariantMessageMappings6966);
            lv_variants_2_0=ruleVariantMessageMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantMessageMappingsRule());
            	        }
                   		add(
                   			current, 
                   			"variants",
                    		lv_variants_2_0, 
                    		"VariantMessageMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3002:2: (otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==20) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3002:4: otherlv_3= ',' ( (lv_variants_4_0= ruleVariantMessageMapping ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVariantMessageMappings6979); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVariantMessageMappingsAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3006:1: ( (lv_variants_4_0= ruleVariantMessageMapping ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3007:1: (lv_variants_4_0= ruleVariantMessageMapping )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3007:1: (lv_variants_4_0= ruleVariantMessageMapping )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3008:3: lv_variants_4_0= ruleVariantMessageMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariantMessageMappingsAccess().getVariantsVariantMessageMappingParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariantMessageMapping_in_ruleVariantMessageMappings7000);
            	    lv_variants_4_0=ruleVariantMessageMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariantMessageMappingsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variants",
            	            		lv_variants_4_0, 
            	            		"VariantMessageMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVariantMessageMappings7014); 

                	newLeafNode(otherlv_5, grammarAccess.getVariantMessageMappingsAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariantMessageMappings"


    // $ANTLR start "entryRuleVariantMessageMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3036:1: entryRuleVariantMessageMapping returns [EObject current=null] : iv_ruleVariantMessageMapping= ruleVariantMessageMapping EOF ;
    public final EObject entryRuleVariantMessageMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariantMessageMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3037:2: (iv_ruleVariantMessageMapping= ruleVariantMessageMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3038:2: iv_ruleVariantMessageMapping= ruleVariantMessageMapping EOF
            {
             newCompositeNode(grammarAccess.getVariantMessageMappingRule()); 
            pushFollow(FOLLOW_ruleVariantMessageMapping_in_entryRuleVariantMessageMapping7050);
            iv_ruleVariantMessageMapping=ruleVariantMessageMapping();

            state._fsp--;

             current =iv_ruleVariantMessageMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariantMessageMapping7060); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariantMessageMapping"


    // $ANTLR start "ruleVariantMessageMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3045:1: ruleVariantMessageMapping returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<' ( (lv_mappings_2_0= ruleMessageMapping ) ) (otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) ) )* otherlv_5= '>' ) ;
    public final EObject ruleVariantMessageMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mappings_2_0 = null;

        EObject lv_mappings_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3048:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<' ( (lv_mappings_2_0= ruleMessageMapping ) ) (otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) ) )* otherlv_5= '>' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3049:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<' ( (lv_mappings_2_0= ruleMessageMapping ) ) (otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) ) )* otherlv_5= '>' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3049:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<' ( (lv_mappings_2_0= ruleMessageMapping ) ) (otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) ) )* otherlv_5= '>' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3049:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<' ( (lv_mappings_2_0= ruleMessageMapping ) ) (otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) ) )* otherlv_5= '>'
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3049:2: ( (otherlv_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3050:1: (otherlv_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3050:1: (otherlv_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3051:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariantMessageMappingRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariantMessageMapping7105); 

            		newLeafNode(otherlv_0, grammarAccess.getVariantMessageMappingAccess().getVariantTransactionVariantCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleVariantMessageMapping7117); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantMessageMappingAccess().getLessThanSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3066:1: ( (lv_mappings_2_0= ruleMessageMapping ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3067:1: (lv_mappings_2_0= ruleMessageMapping )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3067:1: (lv_mappings_2_0= ruleMessageMapping )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3068:3: lv_mappings_2_0= ruleMessageMapping
            {
             
            	        newCompositeNode(grammarAccess.getVariantMessageMappingAccess().getMappingsMessageMappingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageMapping_in_ruleVariantMessageMapping7138);
            lv_mappings_2_0=ruleMessageMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantMessageMappingRule());
            	        }
                   		add(
                   			current, 
                   			"mappings",
                    		lv_mappings_2_0, 
                    		"MessageMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3084:2: (otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3084:4: otherlv_3= ',' ( (lv_mappings_4_0= ruleMessageMapping ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleVariantMessageMapping7151); 

            	        	newLeafNode(otherlv_3, grammarAccess.getVariantMessageMappingAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3088:1: ( (lv_mappings_4_0= ruleMessageMapping ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3089:1: (lv_mappings_4_0= ruleMessageMapping )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3089:1: (lv_mappings_4_0= ruleMessageMapping )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3090:3: lv_mappings_4_0= ruleMessageMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariantMessageMappingAccess().getMappingsMessageMappingParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageMapping_in_ruleVariantMessageMapping7172);
            	    lv_mappings_4_0=ruleMessageMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariantMessageMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappings",
            	            		lv_mappings_4_0, 
            	            		"MessageMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleVariantMessageMapping7186); 

                	newLeafNode(otherlv_5, grammarAccess.getVariantMessageMappingAccess().getGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariantMessageMapping"


    // $ANTLR start "entryRuleMessageMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3118:1: entryRuleMessageMapping returns [EObject current=null] : iv_ruleMessageMapping= ruleMessageMapping EOF ;
    public final EObject entryRuleMessageMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageMapping = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3119:2: (iv_ruleMessageMapping= ruleMessageMapping EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3120:2: iv_ruleMessageMapping= ruleMessageMapping EOF
            {
             newCompositeNode(grammarAccess.getMessageMappingRule()); 
            pushFollow(FOLLOW_ruleMessageMapping_in_entryRuleMessageMapping7222);
            iv_ruleMessageMapping=ruleMessageMapping();

            state._fsp--;

             current =iv_ruleMessageMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageMapping7232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageMapping"


    // $ANTLR start "ruleMessageMapping"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3127:1: ruleMessageMapping returns [EObject current=null] : ( ( (lv_parameter_0_0= ruleMessageName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleMessageName ) ) ) ;
    public final EObject ruleMessageMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_parameter_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3130:28: ( ( ( (lv_parameter_0_0= ruleMessageName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleMessageName ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3131:1: ( ( (lv_parameter_0_0= ruleMessageName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleMessageName ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3131:1: ( ( (lv_parameter_0_0= ruleMessageName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleMessageName ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3131:2: ( (lv_parameter_0_0= ruleMessageName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleMessageName ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3131:2: ( (lv_parameter_0_0= ruleMessageName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3132:1: (lv_parameter_0_0= ruleMessageName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3132:1: (lv_parameter_0_0= ruleMessageName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3133:3: lv_parameter_0_0= ruleMessageName
            {
             
            	        newCompositeNode(grammarAccess.getMessageMappingAccess().getParameterMessageNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageName_in_ruleMessageMapping7278);
            lv_parameter_0_0=ruleMessageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageMappingRule());
            	        }
                   		set(
                   			current, 
                   			"parameter",
                    		lv_parameter_0_0, 
                    		"MessageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleMessageMapping7290); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageMappingAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3153:1: ( (lv_value_2_0= ruleMessageName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3154:1: (lv_value_2_0= ruleMessageName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3154:1: (lv_value_2_0= ruleMessageName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3155:3: lv_value_2_0= ruleMessageName
            {
             
            	        newCompositeNode(grammarAccess.getMessageMappingAccess().getValueMessageNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMessageName_in_ruleMessageMapping7311);
            lv_value_2_0=ruleMessageName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageMappingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"MessageName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageMapping"


    // $ANTLR start "entryRuleMessageName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3179:1: entryRuleMessageName returns [String current=null] : iv_ruleMessageName= ruleMessageName EOF ;
    public final String entryRuleMessageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageName = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3180:2: (iv_ruleMessageName= ruleMessageName EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3181:2: iv_ruleMessageName= ruleMessageName EOF
            {
             newCompositeNode(grammarAccess.getMessageNameRule()); 
            pushFollow(FOLLOW_ruleMessageName_in_entryRuleMessageName7348);
            iv_ruleMessageName=ruleMessageName();

            state._fsp--;

             current =iv_ruleMessageName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageName7359); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageName"


    // $ANTLR start "ruleMessageName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3188:1: ruleMessageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleMessageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3191:28: (this_QualifiedName_0= ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3193:5: this_QualifiedName_0= ruleQualifiedName
            {
             
                    newCompositeNode(grammarAccess.getMessageNameAccess().getQualifiedNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMessageName7405);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageName"


    // $ANTLR start "entryRuleRequiredFeatures"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3211:1: entryRuleRequiredFeatures returns [EObject current=null] : iv_ruleRequiredFeatures= ruleRequiredFeatures EOF ;
    public final EObject entryRuleRequiredFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredFeatures = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3212:2: (iv_ruleRequiredFeatures= ruleRequiredFeatures EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3213:2: iv_ruleRequiredFeatures= ruleRequiredFeatures EOF
            {
             newCompositeNode(grammarAccess.getRequiredFeaturesRule()); 
            pushFollow(FOLLOW_ruleRequiredFeatures_in_entryRuleRequiredFeatures7449);
            iv_ruleRequiredFeatures=ruleRequiredFeatures();

            state._fsp--;

             current =iv_ruleRequiredFeatures; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredFeatures7459); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredFeatures"


    // $ANTLR start "ruleRequiredFeatures"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3220:1: ruleRequiredFeatures returns [EObject current=null] : (otherlv_0= 'requires' otherlv_1= '(' ( (lv_features_2_0= ruleRequiredFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleRequiredFeatures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_2_0 = null;

        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3223:28: ( (otherlv_0= 'requires' otherlv_1= '(' ( (lv_features_2_0= ruleRequiredFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) ) )? otherlv_5= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3224:1: (otherlv_0= 'requires' otherlv_1= '(' ( (lv_features_2_0= ruleRequiredFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) ) )? otherlv_5= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3224:1: (otherlv_0= 'requires' otherlv_1= '(' ( (lv_features_2_0= ruleRequiredFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) ) )? otherlv_5= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3224:3: otherlv_0= 'requires' otherlv_1= '(' ( (lv_features_2_0= ruleRequiredFeature ) ) (otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleRequiredFeatures7496); 

                	newLeafNode(otherlv_0, grammarAccess.getRequiredFeaturesAccess().getRequiresKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleRequiredFeatures7508); 

                	newLeafNode(otherlv_1, grammarAccess.getRequiredFeaturesAccess().getLeftParenthesisKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3232:1: ( (lv_features_2_0= ruleRequiredFeature ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3233:1: (lv_features_2_0= ruleRequiredFeature )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3233:1: (lv_features_2_0= ruleRequiredFeature )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3234:3: lv_features_2_0= ruleRequiredFeature
            {
             
            	        newCompositeNode(grammarAccess.getRequiredFeaturesAccess().getFeaturesRequiredFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRequiredFeature_in_ruleRequiredFeatures7529);
            lv_features_2_0=ruleRequiredFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequiredFeaturesRule());
            	        }
                   		add(
                   			current, 
                   			"features",
                    		lv_features_2_0, 
                    		"RequiredFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3250:2: (otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3250:4: otherlv_3= ',' ( (lv_features_4_0= ruleRequiredFeature ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRequiredFeatures7542); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequiredFeaturesAccess().getCommaKeyword_3_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3254:1: ( (lv_features_4_0= ruleRequiredFeature ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3255:1: (lv_features_4_0= ruleRequiredFeature )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3255:1: (lv_features_4_0= ruleRequiredFeature )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3256:3: lv_features_4_0= ruleRequiredFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequiredFeaturesAccess().getFeaturesRequiredFeatureParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredFeature_in_ruleRequiredFeatures7563);
                    lv_features_4_0=ruleRequiredFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequiredFeaturesRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_4_0, 
                            		"RequiredFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleRequiredFeatures7577); 

                	newLeafNode(otherlv_5, grammarAccess.getRequiredFeaturesAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredFeatures"


    // $ANTLR start "entryRuleRequiredFeature"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3284:1: entryRuleRequiredFeature returns [EObject current=null] : iv_ruleRequiredFeature= ruleRequiredFeature EOF ;
    public final EObject entryRuleRequiredFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredFeature = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3285:2: (iv_ruleRequiredFeature= ruleRequiredFeature EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3286:2: iv_ruleRequiredFeature= ruleRequiredFeature EOF
            {
             newCompositeNode(grammarAccess.getRequiredFeatureRule()); 
            pushFollow(FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature7613);
            iv_ruleRequiredFeature=ruleRequiredFeature();

            state._fsp--;

             current =iv_ruleRequiredFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredFeature7623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredFeature"


    // $ANTLR start "ruleRequiredFeature"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3293:1: ruleRequiredFeature returns [EObject current=null] : (this_AuthorizationFeature_0= ruleAuthorizationFeature | this_NonRepudiationFeature_1= ruleNonRepudiationFeature ) ;
    public final EObject ruleRequiredFeature() throws RecognitionException {
        EObject current = null;

        EObject this_AuthorizationFeature_0 = null;

        EObject this_NonRepudiationFeature_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3296:28: ( (this_AuthorizationFeature_0= ruleAuthorizationFeature | this_NonRepudiationFeature_1= ruleNonRepudiationFeature ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3297:1: (this_AuthorizationFeature_0= ruleAuthorizationFeature | this_NonRepudiationFeature_1= ruleNonRepudiationFeature )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3297:1: (this_AuthorizationFeature_0= ruleAuthorizationFeature | this_NonRepudiationFeature_1= ruleNonRepudiationFeature )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            else if ( (LA44_0==47) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3298:5: this_AuthorizationFeature_0= ruleAuthorizationFeature
                    {
                     
                            newCompositeNode(grammarAccess.getRequiredFeatureAccess().getAuthorizationFeatureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAuthorizationFeature_in_ruleRequiredFeature7670);
                    this_AuthorizationFeature_0=ruleAuthorizationFeature();

                    state._fsp--;

                     
                            current = this_AuthorizationFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3308:5: this_NonRepudiationFeature_1= ruleNonRepudiationFeature
                    {
                     
                            newCompositeNode(grammarAccess.getRequiredFeatureAccess().getNonRepudiationFeatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonRepudiationFeature_in_ruleRequiredFeature7697);
                    this_NonRepudiationFeature_1=ruleNonRepudiationFeature();

                    state._fsp--;

                     
                            current = this_NonRepudiationFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredFeature"


    // $ANTLR start "entryRuleAuthorizationFeature"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3324:1: entryRuleAuthorizationFeature returns [EObject current=null] : iv_ruleAuthorizationFeature= ruleAuthorizationFeature EOF ;
    public final EObject entryRuleAuthorizationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorizationFeature = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3325:2: (iv_ruleAuthorizationFeature= ruleAuthorizationFeature EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3326:2: iv_ruleAuthorizationFeature= ruleAuthorizationFeature EOF
            {
             newCompositeNode(grammarAccess.getAuthorizationFeatureRule()); 
            pushFollow(FOLLOW_ruleAuthorizationFeature_in_entryRuleAuthorizationFeature7732);
            iv_ruleAuthorizationFeature=ruleAuthorizationFeature();

            state._fsp--;

             current =iv_ruleAuthorizationFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthorizationFeature7742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthorizationFeature"


    // $ANTLR start "ruleAuthorizationFeature"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3333:1: ruleAuthorizationFeature returns [EObject current=null] : ( (lv_authorization_0_0= 'authorization' ) ) ;
    public final EObject ruleAuthorizationFeature() throws RecognitionException {
        EObject current = null;

        Token lv_authorization_0_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3336:28: ( ( (lv_authorization_0_0= 'authorization' ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3337:1: ( (lv_authorization_0_0= 'authorization' ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3337:1: ( (lv_authorization_0_0= 'authorization' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3338:1: (lv_authorization_0_0= 'authorization' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3338:1: (lv_authorization_0_0= 'authorization' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3339:3: lv_authorization_0_0= 'authorization'
            {
            lv_authorization_0_0=(Token)match(input,46,FOLLOW_46_in_ruleAuthorizationFeature7784); 

                    newLeafNode(lv_authorization_0_0, grammarAccess.getAuthorizationFeatureAccess().getAuthorizationAuthorizationKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAuthorizationFeatureRule());
            	        }
                   		setWithLastConsumed(current, "authorization", true, "authorization");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthorizationFeature"


    // $ANTLR start "entryRuleNonRepudiationFeature"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3360:1: entryRuleNonRepudiationFeature returns [EObject current=null] : iv_ruleNonRepudiationFeature= ruleNonRepudiationFeature EOF ;
    public final EObject entryRuleNonRepudiationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonRepudiationFeature = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3361:2: (iv_ruleNonRepudiationFeature= ruleNonRepudiationFeature EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3362:2: iv_ruleNonRepudiationFeature= ruleNonRepudiationFeature EOF
            {
             newCompositeNode(grammarAccess.getNonRepudiationFeatureRule()); 
            pushFollow(FOLLOW_ruleNonRepudiationFeature_in_entryRuleNonRepudiationFeature7832);
            iv_ruleNonRepudiationFeature=ruleNonRepudiationFeature();

            state._fsp--;

             current =iv_ruleNonRepudiationFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonRepudiationFeature7842); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonRepudiationFeature"


    // $ANTLR start "ruleNonRepudiationFeature"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3369:1: ruleNonRepudiationFeature returns [EObject current=null] : ( (lv_nonrepudiation_0_0= 'nonrepudiation' ) ) ;
    public final EObject ruleNonRepudiationFeature() throws RecognitionException {
        EObject current = null;

        Token lv_nonrepudiation_0_0=null;

         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3372:28: ( ( (lv_nonrepudiation_0_0= 'nonrepudiation' ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3373:1: ( (lv_nonrepudiation_0_0= 'nonrepudiation' ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3373:1: ( (lv_nonrepudiation_0_0= 'nonrepudiation' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3374:1: (lv_nonrepudiation_0_0= 'nonrepudiation' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3374:1: (lv_nonrepudiation_0_0= 'nonrepudiation' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3375:3: lv_nonrepudiation_0_0= 'nonrepudiation'
            {
            lv_nonrepudiation_0_0=(Token)match(input,47,FOLLOW_47_in_ruleNonRepudiationFeature7884); 

                    newLeafNode(lv_nonrepudiation_0_0, grammarAccess.getNonRepudiationFeatureAccess().getNonrepudiationNonrepudiationKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonRepudiationFeatureRule());
            	        }
                   		setWithLastConsumed(current, "nonrepudiation", true, "nonrepudiation");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonRepudiationFeature"


    // $ANTLR start "entryRuleNotifyTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3396:1: entryRuleNotifyTransaction returns [EObject current=null] : iv_ruleNotifyTransaction= ruleNotifyTransaction EOF ;
    public final EObject entryRuleNotifyTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotifyTransaction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3397:2: (iv_ruleNotifyTransaction= ruleNotifyTransaction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3398:2: iv_ruleNotifyTransaction= ruleNotifyTransaction EOF
            {
             newCompositeNode(grammarAccess.getNotifyTransactionRule()); 
            pushFollow(FOLLOW_ruleNotifyTransaction_in_entryRuleNotifyTransaction7932);
            iv_ruleNotifyTransaction=ruleNotifyTransaction();

            state._fsp--;

             current =iv_ruleNotifyTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotifyTransaction7942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotifyTransaction"


    // $ANTLR start "ruleNotifyTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3405:1: ruleNotifyTransaction returns [EObject current=null] : ( ( (lv_pattern_0_0= 'notify' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleOneWayAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' ) ;
    public final EObject ruleNotifyTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject lv_variants_3_0 = null;

        EObject lv_variants_5_0 = null;

        EObject lv_sendAction_9_0 = null;

        EObject lv_postconditions_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3408:28: ( ( ( (lv_pattern_0_0= 'notify' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleOneWayAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3409:1: ( ( (lv_pattern_0_0= 'notify' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleOneWayAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3409:1: ( ( (lv_pattern_0_0= 'notify' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleOneWayAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3409:2: ( (lv_pattern_0_0= 'notify' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleOneWayAction ) ) ( (lv_postconditions_10_0= rulePostconditions ) )? otherlv_11= '}'
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3409:2: ( (lv_pattern_0_0= 'notify' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3410:1: (lv_pattern_0_0= 'notify' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3410:1: (lv_pattern_0_0= 'notify' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3411:3: lv_pattern_0_0= 'notify'
            {
            lv_pattern_0_0=(Token)match(input,48,FOLLOW_48_in_ruleNotifyTransaction7985); 

                    newLeafNode(lv_pattern_0_0, grammarAccess.getNotifyTransactionAccess().getPatternNotifyKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotifyTransactionRule());
            	        }
                   		setWithLastConsumed(current, "pattern", lv_pattern_0_0, "notify");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3424:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3425:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3425:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3426:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNotifyTransaction8015); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNotifyTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotifyTransactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3442:2: (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==33) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3442:4: otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleNotifyTransaction8033); 

                        	newLeafNode(otherlv_2, grammarAccess.getNotifyTransactionAccess().getLessThanSignKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3446:1: ( (lv_variants_3_0= ruleTransactionVariant ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3447:1: (lv_variants_3_0= ruleTransactionVariant )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3447:1: (lv_variants_3_0= ruleTransactionVariant )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3448:3: lv_variants_3_0= ruleTransactionVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotifyTransactionAccess().getVariantsTransactionVariantParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTransactionVariant_in_ruleNotifyTransaction8054);
                    lv_variants_3_0=ruleTransactionVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotifyTransactionRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"TransactionVariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3464:2: (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3464:4: otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleNotifyTransaction8067); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getNotifyTransactionAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3468:1: ( (lv_variants_5_0= ruleTransactionVariant ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3469:1: (lv_variants_5_0= ruleTransactionVariant )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3469:1: (lv_variants_5_0= ruleTransactionVariant )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3470:3: lv_variants_5_0= ruleTransactionVariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNotifyTransactionAccess().getVariantsTransactionVariantParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransactionVariant_in_ruleNotifyTransaction8088);
                    	    lv_variants_5_0=ruleTransactionVariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNotifyTransactionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variants",
                    	            		lv_variants_5_0, 
                    	            		"TransactionVariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleNotifyTransaction8102); 

                        	newLeafNode(otherlv_6, grammarAccess.getNotifyTransactionAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleNotifyTransaction8116); 

                	newLeafNode(otherlv_7, grammarAccess.getNotifyTransactionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleNotifyTransaction8128); 

                	newLeafNode(otherlv_8, grammarAccess.getNotifyTransactionAccess().getSendKeyword_4());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3498:1: ( (lv_sendAction_9_0= ruleOneWayAction ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3499:1: (lv_sendAction_9_0= ruleOneWayAction )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3499:1: (lv_sendAction_9_0= ruleOneWayAction )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3500:3: lv_sendAction_9_0= ruleOneWayAction
            {
             
            	        newCompositeNode(grammarAccess.getNotifyTransactionAccess().getSendActionOneWayActionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleOneWayAction_in_ruleNotifyTransaction8149);
            lv_sendAction_9_0=ruleOneWayAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNotifyTransactionRule());
            	        }
                   		set(
                   			current, 
                   			"sendAction",
                    		lv_sendAction_9_0, 
                    		"OneWayAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3516:2: ( (lv_postconditions_10_0= rulePostconditions ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3517:1: (lv_postconditions_10_0= rulePostconditions )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3517:1: (lv_postconditions_10_0= rulePostconditions )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3518:3: lv_postconditions_10_0= rulePostconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotifyTransactionAccess().getPostconditionsPostconditionsParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_rulePostconditions_in_ruleNotifyTransaction8170);
                    lv_postconditions_10_0=rulePostconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotifyTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"postconditions",
                            		lv_postconditions_10_0, 
                            		"Postconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleNotifyTransaction8183); 

                	newLeafNode(otherlv_11, grammarAccess.getNotifyTransactionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotifyTransaction"


    // $ANTLR start "entryRuleOneWayAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3546:1: entryRuleOneWayAction returns [EObject current=null] : iv_ruleOneWayAction= ruleOneWayAction EOF ;
    public final EObject entryRuleOneWayAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneWayAction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3547:2: (iv_ruleOneWayAction= ruleOneWayAction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3548:2: iv_ruleOneWayAction= ruleOneWayAction EOF
            {
             newCompositeNode(grammarAccess.getOneWayActionRule()); 
            pushFollow(FOLLOW_ruleOneWayAction_in_entryRuleOneWayAction8219);
            iv_ruleOneWayAction=ruleOneWayAction();

            state._fsp--;

             current =iv_ruleOneWayAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayAction8229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneWayAction"


    // $ANTLR start "ruleOneWayAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3555:1: ruleOneWayAction returns [EObject current=null] : (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleOneWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
    public final EObject ruleOneWayAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_retries_6_0=null;
        Token otherlv_7=null;
        EObject lv_messages_1_0 = null;

        EObject lv_requires_2_0 = null;

        EObject lv_timeouts_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3558:28: ( (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleOneWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3559:1: (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleOneWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3559:1: (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleOneWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3559:3: otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleOneWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleOneWayAction8266); 

                	newLeafNode(otherlv_0, grammarAccess.getOneWayActionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3563:1: ( (lv_messages_1_0= ruleVariantMessageMappings ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3564:1: (lv_messages_1_0= ruleVariantMessageMappings )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3564:1: (lv_messages_1_0= ruleVariantMessageMappings )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3565:3: lv_messages_1_0= ruleVariantMessageMappings
                    {
                     
                    	        newCompositeNode(grammarAccess.getOneWayActionAccess().getMessagesVariantMessageMappingsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariantMessageMappings_in_ruleOneWayAction8287);
                    lv_messages_1_0=ruleVariantMessageMappings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOneWayActionRule());
                    	        }
                           		set(
                           			current, 
                           			"messages",
                            		lv_messages_1_0, 
                            		"VariantMessageMappings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3581:3: ( (lv_requires_2_0= ruleRequiredFeatures ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==45) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3582:1: (lv_requires_2_0= ruleRequiredFeatures )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3582:1: (lv_requires_2_0= ruleRequiredFeatures )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3583:3: lv_requires_2_0= ruleRequiredFeatures
                    {
                     
                    	        newCompositeNode(grammarAccess.getOneWayActionAccess().getRequiresRequiredFeaturesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredFeatures_in_ruleOneWayAction8309);
                    lv_requires_2_0=ruleRequiredFeatures();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOneWayActionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_2_0, 
                            		"RequiredFeatures");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3599:3: ( (lv_timeouts_3_0= ruleOneWayTimeOuts ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3600:1: (lv_timeouts_3_0= ruleOneWayTimeOuts )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3600:1: (lv_timeouts_3_0= ruleOneWayTimeOuts )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3601:3: lv_timeouts_3_0= ruleOneWayTimeOuts
            {
             
            	        newCompositeNode(grammarAccess.getOneWayActionAccess().getTimeoutsOneWayTimeOutsParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleOneWayTimeOuts_in_ruleOneWayAction8331);
            lv_timeouts_3_0=ruleOneWayTimeOuts();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneWayActionRule());
            	        }
                   		set(
                   			current, 
                   			"timeouts",
                    		lv_timeouts_3_0, 
                    		"OneWayTimeOuts");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleOneWayAction8343); 

                	newLeafNode(otherlv_4, grammarAccess.getOneWayActionAccess().getRetriesKeyword_4());
                
            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleOneWayAction8355); 

                	newLeafNode(otherlv_5, grammarAccess.getOneWayActionAccess().getEqualsSignKeyword_5());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3625:1: ( (lv_retries_6_0= RULE_INT ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3626:1: (lv_retries_6_0= RULE_INT )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3626:1: (lv_retries_6_0= RULE_INT )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3627:3: lv_retries_6_0= RULE_INT
            {
            lv_retries_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOneWayAction8372); 

            			newLeafNode(lv_retries_6_0, grammarAccess.getOneWayActionAccess().getRetriesINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOneWayActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"retries",
                    		lv_retries_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleOneWayAction8389); 

                	newLeafNode(otherlv_7, grammarAccess.getOneWayActionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneWayAction"


    // $ANTLR start "entryRuleOneWayTimeOuts"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3655:1: entryRuleOneWayTimeOuts returns [EObject current=null] : iv_ruleOneWayTimeOuts= ruleOneWayTimeOuts EOF ;
    public final EObject entryRuleOneWayTimeOuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneWayTimeOuts = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3656:2: (iv_ruleOneWayTimeOuts= ruleOneWayTimeOuts EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3657:2: iv_ruleOneWayTimeOuts= ruleOneWayTimeOuts EOF
            {
             newCompositeNode(grammarAccess.getOneWayTimeOutsRule()); 
            pushFollow(FOLLOW_ruleOneWayTimeOuts_in_entryRuleOneWayTimeOuts8425);
            iv_ruleOneWayTimeOuts=ruleOneWayTimeOuts();

            state._fsp--;

             current =iv_ruleOneWayTimeOuts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayTimeOuts8435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneWayTimeOuts"


    // $ANTLR start "ruleOneWayTimeOuts"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3664:1: ruleOneWayTimeOuts returns [EObject current=null] : (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleOneWayTimeOut ) ) (otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleOneWayTimeOuts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_timeouts_2_0 = null;

        EObject lv_timeouts_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3667:28: ( (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleOneWayTimeOut ) ) (otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) ) )? otherlv_5= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3668:1: (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleOneWayTimeOut ) ) (otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) ) )? otherlv_5= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3668:1: (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleOneWayTimeOut ) ) (otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) ) )? otherlv_5= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3668:3: otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleOneWayTimeOut ) ) (otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleOneWayTimeOuts8472); 

                	newLeafNode(otherlv_0, grammarAccess.getOneWayTimeOutsAccess().getTimeoutsKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOneWayTimeOuts8484); 

                	newLeafNode(otherlv_1, grammarAccess.getOneWayTimeOutsAccess().getLeftParenthesisKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3676:1: ( (lv_timeouts_2_0= ruleOneWayTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3677:1: (lv_timeouts_2_0= ruleOneWayTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3677:1: (lv_timeouts_2_0= ruleOneWayTimeOut )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3678:3: lv_timeouts_2_0= ruleOneWayTimeOut
            {
             
            	        newCompositeNode(grammarAccess.getOneWayTimeOutsAccess().getTimeoutsOneWayTimeOutParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOneWayTimeOut_in_ruleOneWayTimeOuts8505);
            lv_timeouts_2_0=ruleOneWayTimeOut();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOneWayTimeOutsRule());
            	        }
                   		add(
                   			current, 
                   			"timeouts",
                    		lv_timeouts_2_0, 
                    		"OneWayTimeOut");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3694:2: (otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3694:4: otherlv_3= ',' ( (lv_timeouts_4_0= ruleOneWayTimeOut ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOneWayTimeOuts8518); 

                        	newLeafNode(otherlv_3, grammarAccess.getOneWayTimeOutsAccess().getCommaKeyword_3_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3698:1: ( (lv_timeouts_4_0= ruleOneWayTimeOut ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3699:1: (lv_timeouts_4_0= ruleOneWayTimeOut )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3699:1: (lv_timeouts_4_0= ruleOneWayTimeOut )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3700:3: lv_timeouts_4_0= ruleOneWayTimeOut
                    {
                     
                    	        newCompositeNode(grammarAccess.getOneWayTimeOutsAccess().getTimeoutsOneWayTimeOutParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOneWayTimeOut_in_ruleOneWayTimeOuts8539);
                    lv_timeouts_4_0=ruleOneWayTimeOut();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOneWayTimeOutsRule());
                    	        }
                           		add(
                           			current, 
                           			"timeouts",
                            		lv_timeouts_4_0, 
                            		"OneWayTimeOut");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleOneWayTimeOuts8553); 

                	newLeafNode(otherlv_5, grammarAccess.getOneWayTimeOutsAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneWayTimeOuts"


    // $ANTLR start "entryRuleOneWayTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3728:1: entryRuleOneWayTimeOut returns [EObject current=null] : iv_ruleOneWayTimeOut= ruleOneWayTimeOut EOF ;
    public final EObject entryRuleOneWayTimeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneWayTimeOut = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3729:2: (iv_ruleOneWayTimeOut= ruleOneWayTimeOut EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3730:2: iv_ruleOneWayTimeOut= ruleOneWayTimeOut EOF
            {
             newCompositeNode(grammarAccess.getOneWayTimeOutRule()); 
            pushFollow(FOLLOW_ruleOneWayTimeOut_in_entryRuleOneWayTimeOut8589);
            iv_ruleOneWayTimeOut=ruleOneWayTimeOut();

            state._fsp--;

             current =iv_ruleOneWayTimeOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneWayTimeOut8599); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOneWayTimeOut"


    // $ANTLR start "ruleOneWayTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3737:1: ruleOneWayTimeOut returns [EObject current=null] : (this_ReceiptAckTimeOut_0= ruleReceiptAckTimeOut | this_ValidationAckTimeOut_1= ruleValidationAckTimeOut ) ;
    public final EObject ruleOneWayTimeOut() throws RecognitionException {
        EObject current = null;

        EObject this_ReceiptAckTimeOut_0 = null;

        EObject this_ValidationAckTimeOut_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3740:28: ( (this_ReceiptAckTimeOut_0= ruleReceiptAckTimeOut | this_ValidationAckTimeOut_1= ruleValidationAckTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3741:1: (this_ReceiptAckTimeOut_0= ruleReceiptAckTimeOut | this_ValidationAckTimeOut_1= ruleValidationAckTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3741:1: (this_ReceiptAckTimeOut_0= ruleReceiptAckTimeOut | this_ValidationAckTimeOut_1= ruleValidationAckTimeOut )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            else if ( (LA51_0==52) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3742:5: this_ReceiptAckTimeOut_0= ruleReceiptAckTimeOut
                    {
                     
                            newCompositeNode(grammarAccess.getOneWayTimeOutAccess().getReceiptAckTimeOutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReceiptAckTimeOut_in_ruleOneWayTimeOut8646);
                    this_ReceiptAckTimeOut_0=ruleReceiptAckTimeOut();

                    state._fsp--;

                     
                            current = this_ReceiptAckTimeOut_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3752:5: this_ValidationAckTimeOut_1= ruleValidationAckTimeOut
                    {
                     
                            newCompositeNode(grammarAccess.getOneWayTimeOutAccess().getValidationAckTimeOutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleValidationAckTimeOut_in_ruleOneWayTimeOut8673);
                    this_ValidationAckTimeOut_1=ruleValidationAckTimeOut();

                    state._fsp--;

                     
                            current = this_ValidationAckTimeOut_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOneWayTimeOut"


    // $ANTLR start "entryRuleReceiptAckTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3768:1: entryRuleReceiptAckTimeOut returns [EObject current=null] : iv_ruleReceiptAckTimeOut= ruleReceiptAckTimeOut EOF ;
    public final EObject entryRuleReceiptAckTimeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiptAckTimeOut = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3769:2: (iv_ruleReceiptAckTimeOut= ruleReceiptAckTimeOut EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3770:2: iv_ruleReceiptAckTimeOut= ruleReceiptAckTimeOut EOF
            {
             newCompositeNode(grammarAccess.getReceiptAckTimeOutRule()); 
            pushFollow(FOLLOW_ruleReceiptAckTimeOut_in_entryRuleReceiptAckTimeOut8708);
            iv_ruleReceiptAckTimeOut=ruleReceiptAckTimeOut();

            state._fsp--;

             current =iv_ruleReceiptAckTimeOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReceiptAckTimeOut8718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiptAckTimeOut"


    // $ANTLR start "ruleReceiptAckTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3777:1: ruleReceiptAckTimeOut returns [EObject current=null] : (otherlv_0= 'receipt' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) ) ;
    public final EObject ruleReceiptAckTimeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_timeout_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3780:28: ( (otherlv_0= 'receipt' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3781:1: (otherlv_0= 'receipt' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3781:1: (otherlv_0= 'receipt' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3781:3: otherlv_0= 'receipt' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleReceiptAckTimeOut8755); 

                	newLeafNode(otherlv_0, grammarAccess.getReceiptAckTimeOutAccess().getReceiptKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleReceiptAckTimeOut8767); 

                	newLeafNode(otherlv_1, grammarAccess.getReceiptAckTimeOutAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3789:1: ( (lv_timeout_2_0= ruleTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3790:1: (lv_timeout_2_0= ruleTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3790:1: (lv_timeout_2_0= ruleTimeOut )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3791:3: lv_timeout_2_0= ruleTimeOut
            {
             
            	        newCompositeNode(grammarAccess.getReceiptAckTimeOutAccess().getTimeoutTimeOutParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeOut_in_ruleReceiptAckTimeOut8788);
            lv_timeout_2_0=ruleTimeOut();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReceiptAckTimeOutRule());
            	        }
                   		set(
                   			current, 
                   			"timeout",
                    		lv_timeout_2_0, 
                    		"TimeOut");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiptAckTimeOut"


    // $ANTLR start "entryRuleTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3815:1: entryRuleTimeOut returns [EObject current=null] : iv_ruleTimeOut= ruleTimeOut EOF ;
    public final EObject entryRuleTimeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeOut = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3816:2: (iv_ruleTimeOut= ruleTimeOut EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3817:2: iv_ruleTimeOut= ruleTimeOut EOF
            {
             newCompositeNode(grammarAccess.getTimeOutRule()); 
            pushFollow(FOLLOW_ruleTimeOut_in_entryRuleTimeOut8824);
            iv_ruleTimeOut=ruleTimeOut();

            state._fsp--;

             current =iv_ruleTimeOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeOut8834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeOut"


    // $ANTLR start "ruleTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3824:1: ruleTimeOut returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleTimeOut() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Enumerator lv_unit_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3827:28: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3828:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3828:1: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3828:2: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3828:2: ( (lv_value_0_0= RULE_INT ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3829:1: (lv_value_0_0= RULE_INT )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3829:1: (lv_value_0_0= RULE_INT )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3830:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeOut8876); 

            			newLeafNode(lv_value_0_0, grammarAccess.getTimeOutAccess().getValueINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeOutRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3846:2: ( (lv_unit_1_0= ruleTimeUnit ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3847:1: (lv_unit_1_0= ruleTimeUnit )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3847:1: (lv_unit_1_0= ruleTimeUnit )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3848:3: lv_unit_1_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getTimeOutAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleTimeOut8902);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeOutRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_1_0, 
                    		"TimeUnit");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeOut"


    // $ANTLR start "entryRuleValidationAckTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3872:1: entryRuleValidationAckTimeOut returns [EObject current=null] : iv_ruleValidationAckTimeOut= ruleValidationAckTimeOut EOF ;
    public final EObject entryRuleValidationAckTimeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationAckTimeOut = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3873:2: (iv_ruleValidationAckTimeOut= ruleValidationAckTimeOut EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3874:2: iv_ruleValidationAckTimeOut= ruleValidationAckTimeOut EOF
            {
             newCompositeNode(grammarAccess.getValidationAckTimeOutRule()); 
            pushFollow(FOLLOW_ruleValidationAckTimeOut_in_entryRuleValidationAckTimeOut8938);
            iv_ruleValidationAckTimeOut=ruleValidationAckTimeOut();

            state._fsp--;

             current =iv_ruleValidationAckTimeOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidationAckTimeOut8948); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidationAckTimeOut"


    // $ANTLR start "ruleValidationAckTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3881:1: ruleValidationAckTimeOut returns [EObject current=null] : (otherlv_0= 'validation' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) ) ;
    public final EObject ruleValidationAckTimeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_timeout_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3884:28: ( (otherlv_0= 'validation' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3885:1: (otherlv_0= 'validation' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3885:1: (otherlv_0= 'validation' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3885:3: otherlv_0= 'validation' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleValidationAckTimeOut8985); 

                	newLeafNode(otherlv_0, grammarAccess.getValidationAckTimeOutAccess().getValidationKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleValidationAckTimeOut8997); 

                	newLeafNode(otherlv_1, grammarAccess.getValidationAckTimeOutAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3893:1: ( (lv_timeout_2_0= ruleTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3894:1: (lv_timeout_2_0= ruleTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3894:1: (lv_timeout_2_0= ruleTimeOut )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3895:3: lv_timeout_2_0= ruleTimeOut
            {
             
            	        newCompositeNode(grammarAccess.getValidationAckTimeOutAccess().getTimeoutTimeOutParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeOut_in_ruleValidationAckTimeOut9018);
            lv_timeout_2_0=ruleTimeOut();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidationAckTimeOutRule());
            	        }
                   		set(
                   			current, 
                   			"timeout",
                    		lv_timeout_2_0, 
                    		"TimeOut");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationAckTimeOut"


    // $ANTLR start "entryRuleRequestTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3919:1: entryRuleRequestTransaction returns [EObject current=null] : iv_ruleRequestTransaction= ruleRequestTransaction EOF ;
    public final EObject entryRuleRequestTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestTransaction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3920:2: (iv_ruleRequestTransaction= ruleRequestTransaction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3921:2: iv_ruleRequestTransaction= ruleRequestTransaction EOF
            {
             newCompositeNode(grammarAccess.getRequestTransactionRule()); 
            pushFollow(FOLLOW_ruleRequestTransaction_in_entryRuleRequestTransaction9054);
            iv_ruleRequestTransaction=ruleRequestTransaction();

            state._fsp--;

             current =iv_ruleRequestTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestTransaction9064); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequestTransaction"


    // $ANTLR start "ruleRequestTransaction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3928:1: ruleRequestTransaction returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleTwoWayAction ) ) otherlv_10= 'receive' ( (lv_receiveAction_11_0= ruleOneWayAction ) ) ( (lv_postconditions_12_0= rulePostconditions ) )? otherlv_13= '}' ) ;
    public final EObject ruleRequestTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Enumerator lv_pattern_0_0 = null;

        EObject lv_variants_3_0 = null;

        EObject lv_variants_5_0 = null;

        EObject lv_sendAction_9_0 = null;

        EObject lv_receiveAction_11_0 = null;

        EObject lv_postconditions_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3931:28: ( ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleTwoWayAction ) ) otherlv_10= 'receive' ( (lv_receiveAction_11_0= ruleOneWayAction ) ) ( (lv_postconditions_12_0= rulePostconditions ) )? otherlv_13= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3932:1: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleTwoWayAction ) ) otherlv_10= 'receive' ( (lv_receiveAction_11_0= ruleOneWayAction ) ) ( (lv_postconditions_12_0= rulePostconditions ) )? otherlv_13= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3932:1: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleTwoWayAction ) ) otherlv_10= 'receive' ( (lv_receiveAction_11_0= ruleOneWayAction ) ) ( (lv_postconditions_12_0= rulePostconditions ) )? otherlv_13= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3932:2: ( (lv_pattern_0_0= rulePattern ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )? otherlv_7= '{' otherlv_8= 'send' ( (lv_sendAction_9_0= ruleTwoWayAction ) ) otherlv_10= 'receive' ( (lv_receiveAction_11_0= ruleOneWayAction ) ) ( (lv_postconditions_12_0= rulePostconditions ) )? otherlv_13= '}'
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3932:2: ( (lv_pattern_0_0= rulePattern ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3933:1: (lv_pattern_0_0= rulePattern )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3933:1: (lv_pattern_0_0= rulePattern )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3934:3: lv_pattern_0_0= rulePattern
            {
             
            	        newCompositeNode(grammarAccess.getRequestTransactionAccess().getPatternPatternEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePattern_in_ruleRequestTransaction9110);
            lv_pattern_0_0=rulePattern();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequestTransactionRule());
            	        }
                   		set(
                   			current, 
                   			"pattern",
                    		lv_pattern_0_0, 
                    		"Pattern");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3950:2: ( (lv_name_1_0= RULE_ID ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3951:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3951:1: (lv_name_1_0= RULE_ID )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3952:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestTransaction9127); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequestTransactionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequestTransactionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3968:2: (otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3968:4: otherlv_2= '<' ( (lv_variants_3_0= ruleTransactionVariant ) ) (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleRequestTransaction9145); 

                        	newLeafNode(otherlv_2, grammarAccess.getRequestTransactionAccess().getLessThanSignKeyword_2_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3972:1: ( (lv_variants_3_0= ruleTransactionVariant ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3973:1: (lv_variants_3_0= ruleTransactionVariant )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3973:1: (lv_variants_3_0= ruleTransactionVariant )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3974:3: lv_variants_3_0= ruleTransactionVariant
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestTransactionAccess().getVariantsTransactionVariantParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTransactionVariant_in_ruleRequestTransaction9166);
                    lv_variants_3_0=ruleTransactionVariant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestTransactionRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"TransactionVariant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3990:2: (otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==20) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3990:4: otherlv_4= ',' ( (lv_variants_5_0= ruleTransactionVariant ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleRequestTransaction9179); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRequestTransactionAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3994:1: ( (lv_variants_5_0= ruleTransactionVariant ) )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3995:1: (lv_variants_5_0= ruleTransactionVariant )
                    	    {
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3995:1: (lv_variants_5_0= ruleTransactionVariant )
                    	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:3996:3: lv_variants_5_0= ruleTransactionVariant
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequestTransactionAccess().getVariantsTransactionVariantParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransactionVariant_in_ruleRequestTransaction9200);
                    	    lv_variants_5_0=ruleTransactionVariant();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequestTransactionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variants",
                    	            		lv_variants_5_0, 
                    	            		"TransactionVariant");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleRequestTransaction9214); 

                        	newLeafNode(otherlv_6, grammarAccess.getRequestTransactionAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleRequestTransaction9228); 

                	newLeafNode(otherlv_7, grammarAccess.getRequestTransactionAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleRequestTransaction9240); 

                	newLeafNode(otherlv_8, grammarAccess.getRequestTransactionAccess().getSendKeyword_4());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4024:1: ( (lv_sendAction_9_0= ruleTwoWayAction ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4025:1: (lv_sendAction_9_0= ruleTwoWayAction )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4025:1: (lv_sendAction_9_0= ruleTwoWayAction )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4026:3: lv_sendAction_9_0= ruleTwoWayAction
            {
             
            	        newCompositeNode(grammarAccess.getRequestTransactionAccess().getSendActionTwoWayActionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTwoWayAction_in_ruleRequestTransaction9261);
            lv_sendAction_9_0=ruleTwoWayAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequestTransactionRule());
            	        }
                   		set(
                   			current, 
                   			"sendAction",
                    		lv_sendAction_9_0, 
                    		"TwoWayAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,53,FOLLOW_53_in_ruleRequestTransaction9273); 

                	newLeafNode(otherlv_10, grammarAccess.getRequestTransactionAccess().getReceiveKeyword_6());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4046:1: ( (lv_receiveAction_11_0= ruleOneWayAction ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4047:1: (lv_receiveAction_11_0= ruleOneWayAction )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4047:1: (lv_receiveAction_11_0= ruleOneWayAction )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4048:3: lv_receiveAction_11_0= ruleOneWayAction
            {
             
            	        newCompositeNode(grammarAccess.getRequestTransactionAccess().getReceiveActionOneWayActionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleOneWayAction_in_ruleRequestTransaction9294);
            lv_receiveAction_11_0=ruleOneWayAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRequestTransactionRule());
            	        }
                   		set(
                   			current, 
                   			"receiveAction",
                    		lv_receiveAction_11_0, 
                    		"OneWayAction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4064:2: ( (lv_postconditions_12_0= rulePostconditions ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==29) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4065:1: (lv_postconditions_12_0= rulePostconditions )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4065:1: (lv_postconditions_12_0= rulePostconditions )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4066:3: lv_postconditions_12_0= rulePostconditions
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestTransactionAccess().getPostconditionsPostconditionsParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_rulePostconditions_in_ruleRequestTransaction9315);
                    lv_postconditions_12_0=rulePostconditions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestTransactionRule());
                    	        }
                           		set(
                           			current, 
                           			"postconditions",
                            		lv_postconditions_12_0, 
                            		"Postconditions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleRequestTransaction9328); 

                	newLeafNode(otherlv_13, grammarAccess.getRequestTransactionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequestTransaction"


    // $ANTLR start "entryRuleTwoWayAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4094:1: entryRuleTwoWayAction returns [EObject current=null] : iv_ruleTwoWayAction= ruleTwoWayAction EOF ;
    public final EObject entryRuleTwoWayAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwoWayAction = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4095:2: (iv_ruleTwoWayAction= ruleTwoWayAction EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4096:2: iv_ruleTwoWayAction= ruleTwoWayAction EOF
            {
             newCompositeNode(grammarAccess.getTwoWayActionRule()); 
            pushFollow(FOLLOW_ruleTwoWayAction_in_entryRuleTwoWayAction9364);
            iv_ruleTwoWayAction=ruleTwoWayAction();

            state._fsp--;

             current =iv_ruleTwoWayAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTwoWayAction9374); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTwoWayAction"


    // $ANTLR start "ruleTwoWayAction"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4103:1: ruleTwoWayAction returns [EObject current=null] : (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleTwoWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' ) ;
    public final EObject ruleTwoWayAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_retries_6_0=null;
        Token otherlv_7=null;
        EObject lv_messages_1_0 = null;

        EObject lv_requires_2_0 = null;

        EObject lv_timeouts_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4106:28: ( (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleTwoWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4107:1: (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleTwoWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4107:1: (otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleTwoWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4107:3: otherlv_0= '{' ( (lv_messages_1_0= ruleVariantMessageMappings ) )? ( (lv_requires_2_0= ruleRequiredFeatures ) )? ( (lv_timeouts_3_0= ruleTwoWayTimeOuts ) ) otherlv_4= 'retries' otherlv_5= '=' ( (lv_retries_6_0= RULE_INT ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTwoWayAction9411); 

                	newLeafNode(otherlv_0, grammarAccess.getTwoWayActionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4111:1: ( (lv_messages_1_0= ruleVariantMessageMappings ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==44) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4112:1: (lv_messages_1_0= ruleVariantMessageMappings )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4112:1: (lv_messages_1_0= ruleVariantMessageMappings )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4113:3: lv_messages_1_0= ruleVariantMessageMappings
                    {
                     
                    	        newCompositeNode(grammarAccess.getTwoWayActionAccess().getMessagesVariantMessageMappingsParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariantMessageMappings_in_ruleTwoWayAction9432);
                    lv_messages_1_0=ruleVariantMessageMappings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTwoWayActionRule());
                    	        }
                           		set(
                           			current, 
                           			"messages",
                            		lv_messages_1_0, 
                            		"VariantMessageMappings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4129:3: ( (lv_requires_2_0= ruleRequiredFeatures ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==45) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4130:1: (lv_requires_2_0= ruleRequiredFeatures )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4130:1: (lv_requires_2_0= ruleRequiredFeatures )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4131:3: lv_requires_2_0= ruleRequiredFeatures
                    {
                     
                    	        newCompositeNode(grammarAccess.getTwoWayActionAccess().getRequiresRequiredFeaturesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequiredFeatures_in_ruleTwoWayAction9454);
                    lv_requires_2_0=ruleRequiredFeatures();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTwoWayActionRule());
                    	        }
                           		set(
                           			current, 
                           			"requires",
                            		lv_requires_2_0, 
                            		"RequiredFeatures");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4147:3: ( (lv_timeouts_3_0= ruleTwoWayTimeOuts ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4148:1: (lv_timeouts_3_0= ruleTwoWayTimeOuts )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4148:1: (lv_timeouts_3_0= ruleTwoWayTimeOuts )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4149:3: lv_timeouts_3_0= ruleTwoWayTimeOuts
            {
             
            	        newCompositeNode(grammarAccess.getTwoWayActionAccess().getTimeoutsTwoWayTimeOutsParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTwoWayTimeOuts_in_ruleTwoWayAction9476);
            lv_timeouts_3_0=ruleTwoWayTimeOuts();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTwoWayActionRule());
            	        }
                   		set(
                   			current, 
                   			"timeouts",
                    		lv_timeouts_3_0, 
                    		"TwoWayTimeOuts");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleTwoWayAction9488); 

                	newLeafNode(otherlv_4, grammarAccess.getTwoWayActionAccess().getRetriesKeyword_4());
                
            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleTwoWayAction9500); 

                	newLeafNode(otherlv_5, grammarAccess.getTwoWayActionAccess().getEqualsSignKeyword_5());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4173:1: ( (lv_retries_6_0= RULE_INT ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4174:1: (lv_retries_6_0= RULE_INT )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4174:1: (lv_retries_6_0= RULE_INT )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4175:3: lv_retries_6_0= RULE_INT
            {
            lv_retries_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTwoWayAction9517); 

            			newLeafNode(lv_retries_6_0, grammarAccess.getTwoWayActionAccess().getRetriesINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTwoWayActionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"retries",
                    		lv_retries_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleTwoWayAction9534); 

                	newLeafNode(otherlv_7, grammarAccess.getTwoWayActionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwoWayAction"


    // $ANTLR start "entryRuleTwoWayTimeOuts"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4203:1: entryRuleTwoWayTimeOuts returns [EObject current=null] : iv_ruleTwoWayTimeOuts= ruleTwoWayTimeOuts EOF ;
    public final EObject entryRuleTwoWayTimeOuts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwoWayTimeOuts = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4204:2: (iv_ruleTwoWayTimeOuts= ruleTwoWayTimeOuts EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4205:2: iv_ruleTwoWayTimeOuts= ruleTwoWayTimeOuts EOF
            {
             newCompositeNode(grammarAccess.getTwoWayTimeOutsRule()); 
            pushFollow(FOLLOW_ruleTwoWayTimeOuts_in_entryRuleTwoWayTimeOuts9570);
            iv_ruleTwoWayTimeOuts=ruleTwoWayTimeOuts();

            state._fsp--;

             current =iv_ruleTwoWayTimeOuts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTwoWayTimeOuts9580); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTwoWayTimeOuts"


    // $ANTLR start "ruleTwoWayTimeOuts"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4212:1: ruleTwoWayTimeOuts returns [EObject current=null] : (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleTwoWayTimeOut ) ) ( (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )? )? otherlv_7= ')' ) ;
    public final EObject ruleTwoWayTimeOuts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_timeouts_2_0 = null;

        EObject lv_timeouts_4_0 = null;

        EObject lv_timeouts_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4215:28: ( (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleTwoWayTimeOut ) ) ( (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )? )? otherlv_7= ')' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4216:1: (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleTwoWayTimeOut ) ) ( (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )? )? otherlv_7= ')' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4216:1: (otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleTwoWayTimeOut ) ) ( (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )? )? otherlv_7= ')' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4216:3: otherlv_0= 'timeouts' otherlv_1= '(' ( (lv_timeouts_2_0= ruleTwoWayTimeOut ) ) ( (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )? )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleTwoWayTimeOuts9617); 

                	newLeafNode(otherlv_0, grammarAccess.getTwoWayTimeOutsAccess().getTimeoutsKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTwoWayTimeOuts9629); 

                	newLeafNode(otherlv_1, grammarAccess.getTwoWayTimeOutsAccess().getLeftParenthesisKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4224:1: ( (lv_timeouts_2_0= ruleTwoWayTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4225:1: (lv_timeouts_2_0= ruleTwoWayTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4225:1: (lv_timeouts_2_0= ruleTwoWayTimeOut )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4226:3: lv_timeouts_2_0= ruleTwoWayTimeOut
            {
             
            	        newCompositeNode(grammarAccess.getTwoWayTimeOutsAccess().getTimeoutsTwoWayTimeOutParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTwoWayTimeOut_in_ruleTwoWayTimeOuts9650);
            lv_timeouts_2_0=ruleTwoWayTimeOut();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTwoWayTimeOutsRule());
            	        }
                   		add(
                   			current, 
                   			"timeouts",
                    		lv_timeouts_2_0, 
                    		"TwoWayTimeOut");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4242:2: ( (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )? )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==20) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4242:3: (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) ) (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )?
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4242:3: (otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4242:5: otherlv_3= ',' ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTwoWayTimeOuts9664); 

                        	newLeafNode(otherlv_3, grammarAccess.getTwoWayTimeOutsAccess().getCommaKeyword_3_0_0());
                        
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4246:1: ( (lv_timeouts_4_0= ruleTwoWayTimeOut ) )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4247:1: (lv_timeouts_4_0= ruleTwoWayTimeOut )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4247:1: (lv_timeouts_4_0= ruleTwoWayTimeOut )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4248:3: lv_timeouts_4_0= ruleTwoWayTimeOut
                    {
                     
                    	        newCompositeNode(grammarAccess.getTwoWayTimeOutsAccess().getTimeoutsTwoWayTimeOutParserRuleCall_3_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTwoWayTimeOut_in_ruleTwoWayTimeOuts9685);
                    lv_timeouts_4_0=ruleTwoWayTimeOut();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTwoWayTimeOutsRule());
                    	        }
                           		add(
                           			current, 
                           			"timeouts",
                            		lv_timeouts_4_0, 
                            		"TwoWayTimeOut");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4264:3: (otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==20) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4264:5: otherlv_5= ',' ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) )
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleTwoWayTimeOuts9699); 

                                	newLeafNode(otherlv_5, grammarAccess.getTwoWayTimeOutsAccess().getCommaKeyword_3_1_0());
                                
                            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4268:1: ( (lv_timeouts_6_0= ruleTwoWayTimeOut ) )
                            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4269:1: (lv_timeouts_6_0= ruleTwoWayTimeOut )
                            {
                            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4269:1: (lv_timeouts_6_0= ruleTwoWayTimeOut )
                            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4270:3: lv_timeouts_6_0= ruleTwoWayTimeOut
                            {
                             
                            	        newCompositeNode(grammarAccess.getTwoWayTimeOutsAccess().getTimeoutsTwoWayTimeOutParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTwoWayTimeOut_in_ruleTwoWayTimeOuts9720);
                            lv_timeouts_6_0=ruleTwoWayTimeOut();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTwoWayTimeOutsRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"timeouts",
                                    		lv_timeouts_6_0, 
                                    		"TwoWayTimeOut");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTwoWayTimeOuts9736); 

                	newLeafNode(otherlv_7, grammarAccess.getTwoWayTimeOutsAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwoWayTimeOuts"


    // $ANTLR start "entryRuleTwoWayTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4298:1: entryRuleTwoWayTimeOut returns [EObject current=null] : iv_ruleTwoWayTimeOut= ruleTwoWayTimeOut EOF ;
    public final EObject entryRuleTwoWayTimeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwoWayTimeOut = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4299:2: (iv_ruleTwoWayTimeOut= ruleTwoWayTimeOut EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4300:2: iv_ruleTwoWayTimeOut= ruleTwoWayTimeOut EOF
            {
             newCompositeNode(grammarAccess.getTwoWayTimeOutRule()); 
            pushFollow(FOLLOW_ruleTwoWayTimeOut_in_entryRuleTwoWayTimeOut9772);
            iv_ruleTwoWayTimeOut=ruleTwoWayTimeOut();

            state._fsp--;

             current =iv_ruleTwoWayTimeOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTwoWayTimeOut9782); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTwoWayTimeOut"


    // $ANTLR start "ruleTwoWayTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4307:1: ruleTwoWayTimeOut returns [EObject current=null] : (this_OneWayTimeOut_0= ruleOneWayTimeOut | this_ResponseTimeOut_1= ruleResponseTimeOut ) ;
    public final EObject ruleTwoWayTimeOut() throws RecognitionException {
        EObject current = null;

        EObject this_OneWayTimeOut_0 = null;

        EObject this_ResponseTimeOut_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4310:28: ( (this_OneWayTimeOut_0= ruleOneWayTimeOut | this_ResponseTimeOut_1= ruleResponseTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4311:1: (this_OneWayTimeOut_0= ruleOneWayTimeOut | this_ResponseTimeOut_1= ruleResponseTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4311:1: (this_OneWayTimeOut_0= ruleOneWayTimeOut | this_ResponseTimeOut_1= ruleResponseTimeOut )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=51 && LA59_0<=52)) ) {
                alt59=1;
            }
            else if ( (LA59_0==54) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4312:5: this_OneWayTimeOut_0= ruleOneWayTimeOut
                    {
                     
                            newCompositeNode(grammarAccess.getTwoWayTimeOutAccess().getOneWayTimeOutParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOneWayTimeOut_in_ruleTwoWayTimeOut9829);
                    this_OneWayTimeOut_0=ruleOneWayTimeOut();

                    state._fsp--;

                     
                            current = this_OneWayTimeOut_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4322:5: this_ResponseTimeOut_1= ruleResponseTimeOut
                    {
                     
                            newCompositeNode(grammarAccess.getTwoWayTimeOutAccess().getResponseTimeOutParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleResponseTimeOut_in_ruleTwoWayTimeOut9856);
                    this_ResponseTimeOut_1=ruleResponseTimeOut();

                    state._fsp--;

                     
                            current = this_ResponseTimeOut_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwoWayTimeOut"


    // $ANTLR start "entryRuleResponseTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4338:1: entryRuleResponseTimeOut returns [EObject current=null] : iv_ruleResponseTimeOut= ruleResponseTimeOut EOF ;
    public final EObject entryRuleResponseTimeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponseTimeOut = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4339:2: (iv_ruleResponseTimeOut= ruleResponseTimeOut EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4340:2: iv_ruleResponseTimeOut= ruleResponseTimeOut EOF
            {
             newCompositeNode(grammarAccess.getResponseTimeOutRule()); 
            pushFollow(FOLLOW_ruleResponseTimeOut_in_entryRuleResponseTimeOut9891);
            iv_ruleResponseTimeOut=ruleResponseTimeOut();

            state._fsp--;

             current =iv_ruleResponseTimeOut; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResponseTimeOut9901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponseTimeOut"


    // $ANTLR start "ruleResponseTimeOut"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4347:1: ruleResponseTimeOut returns [EObject current=null] : (otherlv_0= 'response' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) ) ;
    public final EObject ruleResponseTimeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_timeout_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4350:28: ( (otherlv_0= 'response' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4351:1: (otherlv_0= 'response' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4351:1: (otherlv_0= 'response' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4351:3: otherlv_0= 'response' otherlv_1= '=' ( (lv_timeout_2_0= ruleTimeOut ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleResponseTimeOut9938); 

                	newLeafNode(otherlv_0, grammarAccess.getResponseTimeOutAccess().getResponseKeyword_0());
                
            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleResponseTimeOut9950); 

                	newLeafNode(otherlv_1, grammarAccess.getResponseTimeOutAccess().getEqualsSignKeyword_1());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4359:1: ( (lv_timeout_2_0= ruleTimeOut ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4360:1: (lv_timeout_2_0= ruleTimeOut )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4360:1: (lv_timeout_2_0= ruleTimeOut )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4361:3: lv_timeout_2_0= ruleTimeOut
            {
             
            	        newCompositeNode(grammarAccess.getResponseTimeOutAccess().getTimeoutTimeOutParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeOut_in_ruleResponseTimeOut9971);
            lv_timeout_2_0=ruleTimeOut();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResponseTimeOutRule());
            	        }
                   		set(
                   			current, 
                   			"timeout",
                    		lv_timeout_2_0, 
                    		"TimeOut");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponseTimeOut"


    // $ANTLR start "entryRuleProtocol"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4385:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4386:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4387:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol10007);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol10017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4394:1: ruleProtocol returns [EObject current=null] : (this_ProtocolReference_0= ruleProtocolReference | this_ProtocolDeclaration_1= ruleProtocolDeclaration ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject this_ProtocolReference_0 = null;

        EObject this_ProtocolDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4397:28: ( (this_ProtocolReference_0= ruleProtocolReference | this_ProtocolDeclaration_1= ruleProtocolDeclaration ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4398:1: (this_ProtocolReference_0= ruleProtocolReference | this_ProtocolDeclaration_1= ruleProtocolDeclaration )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4398:1: (this_ProtocolReference_0= ruleProtocolReference | this_ProtocolDeclaration_1= ruleProtocolDeclaration )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4399:5: this_ProtocolReference_0= ruleProtocolReference
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getProtocolReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleProtocolReference_in_ruleProtocol10064);
                    this_ProtocolReference_0=ruleProtocolReference();

                    state._fsp--;

                     
                            current = this_ProtocolReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4409:5: this_ProtocolDeclaration_1= ruleProtocolDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getProtocolDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProtocolDeclaration_in_ruleProtocol10091);
                    this_ProtocolDeclaration_1=ruleProtocolDeclaration();

                    state._fsp--;

                     
                            current = this_ProtocolDeclaration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleProtocolReference"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4425:1: entryRuleProtocolReference returns [EObject current=null] : iv_ruleProtocolReference= ruleProtocolReference EOF ;
    public final EObject entryRuleProtocolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolReference = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4426:2: (iv_ruleProtocolReference= ruleProtocolReference EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4427:2: iv_ruleProtocolReference= ruleProtocolReference EOF
            {
             newCompositeNode(grammarAccess.getProtocolReferenceRule()); 
            pushFollow(FOLLOW_ruleProtocolReference_in_entryRuleProtocolReference10126);
            iv_ruleProtocolReference=ruleProtocolReference();

            state._fsp--;

             current =iv_ruleProtocolReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolReference10136); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocolReference"


    // $ANTLR start "ruleProtocolReference"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4434:1: ruleProtocolReference returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) ) ;
    public final EObject ruleProtocolReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4437:28: ( (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4438:1: (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4438:1: (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4438:3: otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleProtocolReference10173); 

                	newLeafNode(otherlv_0, grammarAccess.getProtocolReferenceAccess().getProtocolKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4442:1: ( (lv_name_1_0= ruleProtocolName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4443:1: (lv_name_1_0= ruleProtocolName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4443:1: (lv_name_1_0= ruleProtocolName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4444:3: lv_name_1_0= ruleProtocolName
            {
             
            	        newCompositeNode(grammarAccess.getProtocolReferenceAccess().getNameProtocolNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProtocolName_in_ruleProtocolReference10194);
            lv_name_1_0=ruleProtocolName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ProtocolName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocolReference"


    // $ANTLR start "entryRuleProtocolName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4468:1: entryRuleProtocolName returns [String current=null] : iv_ruleProtocolName= ruleProtocolName EOF ;
    public final String entryRuleProtocolName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtocolName = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4469:2: (iv_ruleProtocolName= ruleProtocolName EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4470:2: iv_ruleProtocolName= ruleProtocolName EOF
            {
             newCompositeNode(grammarAccess.getProtocolNameRule()); 
            pushFollow(FOLLOW_ruleProtocolName_in_entryRuleProtocolName10231);
            iv_ruleProtocolName=ruleProtocolName();

            state._fsp--;

             current =iv_ruleProtocolName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolName10242); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocolName"


    // $ANTLR start "ruleProtocolName"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4477:1: ruleProtocolName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleProtocolName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4480:28: (this_QualifiedName_0= ruleQualifiedName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4482:5: this_QualifiedName_0= ruleQualifiedName
            {
             
                    newCompositeNode(grammarAccess.getProtocolNameAccess().getQualifiedNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProtocolName10288);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocolName"


    // $ANTLR start "entryRuleProtocolDeclaration"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4500:1: entryRuleProtocolDeclaration returns [EObject current=null] : iv_ruleProtocolDeclaration= ruleProtocolDeclaration EOF ;
    public final EObject entryRuleProtocolDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolDeclaration = null;


        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4501:2: (iv_ruleProtocolDeclaration= ruleProtocolDeclaration EOF )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4502:2: iv_ruleProtocolDeclaration= ruleProtocolDeclaration EOF
            {
             newCompositeNode(grammarAccess.getProtocolDeclarationRule()); 
            pushFollow(FOLLOW_ruleProtocolDeclaration_in_entryRuleProtocolDeclaration10332);
            iv_ruleProtocolDeclaration=ruleProtocolDeclaration();

            state._fsp--;

             current =iv_ruleProtocolDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocolDeclaration10342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocolDeclaration"


    // $ANTLR start "ruleProtocolDeclaration"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4509:1: ruleProtocolDeclaration returns [EObject current=null] : (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) otherlv_2= '{' (otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleProtocolDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_messages_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4512:28: ( (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) otherlv_2= '{' (otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) ) )+ otherlv_5= '}' ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4513:1: (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) otherlv_2= '{' (otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) ) )+ otherlv_5= '}' )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4513:1: (otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) otherlv_2= '{' (otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) ) )+ otherlv_5= '}' )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4513:3: otherlv_0= 'protocol' ( (lv_name_1_0= ruleProtocolName ) ) otherlv_2= '{' (otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleProtocolDeclaration10379); 

                	newLeafNode(otherlv_0, grammarAccess.getProtocolDeclarationAccess().getProtocolKeyword_0());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4517:1: ( (lv_name_1_0= ruleProtocolName ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4518:1: (lv_name_1_0= ruleProtocolName )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4518:1: (lv_name_1_0= ruleProtocolName )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4519:3: lv_name_1_0= ruleProtocolName
            {
             
            	        newCompositeNode(grammarAccess.getProtocolDeclarationAccess().getNameProtocolNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleProtocolName_in_ruleProtocolDeclaration10400);
            lv_name_1_0=ruleProtocolName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ProtocolName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleProtocolDeclaration10412); 

                	newLeafNode(otherlv_2, grammarAccess.getProtocolDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4539:1: (otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==56) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4539:3: otherlv_3= 'message' ( (lv_messages_4_0= ruleMessageName ) )
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleProtocolDeclaration10425); 

            	        	newLeafNode(otherlv_3, grammarAccess.getProtocolDeclarationAccess().getMessageKeyword_3_0());
            	        
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4543:1: ( (lv_messages_4_0= ruleMessageName ) )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4544:1: (lv_messages_4_0= ruleMessageName )
            	    {
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4544:1: (lv_messages_4_0= ruleMessageName )
            	    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4545:3: lv_messages_4_0= ruleMessageName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProtocolDeclarationAccess().getMessagesMessageNameParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageName_in_ruleProtocolDeclaration10446);
            	    lv_messages_4_0=ruleMessageName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProtocolDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_4_0, 
            	            		"MessageName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProtocolDeclaration10460); 

                	newLeafNode(otherlv_5, grammarAccess.getProtocolDeclarationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocolDeclaration"


    // $ANTLR start "ruleTimeUnit"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4573:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4575:28: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4576:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4576:1: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'h' ) | (enumLiteral_3= 'd' ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt62=1;
                }
                break;
            case 58:
                {
                alt62=2;
                }
                break;
            case 59:
                {
                alt62=3;
                }
                break;
            case 60:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4576:2: (enumLiteral_0= 's' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4576:2: (enumLiteral_0= 's' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4576:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleTimeUnit10510); 

                            current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4582:6: (enumLiteral_1= 'm' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4582:6: (enumLiteral_1= 'm' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4582:8: enumLiteral_1= 'm'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleTimeUnit10527); 

                            current = grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMINUTESEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4588:6: (enumLiteral_2= 'h' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4588:6: (enumLiteral_2= 'h' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4588:8: enumLiteral_2= 'h'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleTimeUnit10544); 

                            current = grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getHOURSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4594:6: (enumLiteral_3= 'd' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4594:6: (enumLiteral_3= 'd' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4594:8: enumLiteral_3= 'd'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_60_in_ruleTimeUnit10561); 

                            current = grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getDAYSEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rulePattern"
    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4604:1: rulePattern returns [Enumerator current=null] : ( (enumLiteral_0= 'response' ) | (enumLiteral_1= 'confirm' ) | (enumLiteral_2= 'query' ) | (enumLiteral_3= 'obligation' ) ) ;
    public final Enumerator rulePattern() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4606:28: ( ( (enumLiteral_0= 'response' ) | (enumLiteral_1= 'confirm' ) | (enumLiteral_2= 'query' ) | (enumLiteral_3= 'obligation' ) ) )
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4607:1: ( (enumLiteral_0= 'response' ) | (enumLiteral_1= 'confirm' ) | (enumLiteral_2= 'query' ) | (enumLiteral_3= 'obligation' ) )
            {
            // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4607:1: ( (enumLiteral_0= 'response' ) | (enumLiteral_1= 'confirm' ) | (enumLiteral_2= 'query' ) | (enumLiteral_3= 'obligation' ) )
            int alt63=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt63=1;
                }
                break;
            case 61:
                {
                alt63=2;
                }
                break;
            case 62:
                {
                alt63=3;
                }
                break;
            case 63:
                {
                alt63=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4607:2: (enumLiteral_0= 'response' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4607:2: (enumLiteral_0= 'response' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4607:4: enumLiteral_0= 'response'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_rulePattern10606); 

                            current = grammarAccess.getPatternAccess().getResponseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPatternAccess().getResponseEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4613:6: (enumLiteral_1= 'confirm' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4613:6: (enumLiteral_1= 'confirm' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4613:8: enumLiteral_1= 'confirm'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_rulePattern10623); 

                            current = grammarAccess.getPatternAccess().getConfirmEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPatternAccess().getConfirmEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4619:6: (enumLiteral_2= 'query' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4619:6: (enumLiteral_2= 'query' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4619:8: enumLiteral_2= 'query'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_rulePattern10640); 

                            current = grammarAccess.getPatternAccess().getQueryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPatternAccess().getQueryEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4625:6: (enumLiteral_3= 'obligation' )
                    {
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4625:6: (enumLiteral_3= 'obligation' )
                    // ../com.x.xocl/src-gen/com/x/xocl/parser/antlr/internal/InternalXOCL.g:4625:8: enumLiteral_3= 'obligation'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_63_in_rulePattern10657); 

                            current = grammarAccess.getPatternAccess().getObligationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPatternAccess().getObligationEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"

    // Delegated rules


    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA60_eotS =
        "\7\uffff";
    static final String DFA60_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA60_minS =
        "\1\67\1\4\1\15\1\4\2\uffff\1\15";
    static final String DFA60_maxS =
        "\1\67\1\4\1\77\1\4\2\uffff\1\77";
    static final String DFA60_acceptS =
        "\4\uffff\1\1\1\2\1\uffff";
    static final String DFA60_specialS =
        "\7\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\5\2\4\4\uffff\1\4\2\uffff\1\4\6\uffff\1\4\11"+
            "\uffff\1\4\5\uffff\1\4\5\uffff\2\4\5\uffff\3\4",
            "\1\6",
            "",
            "",
            "\1\3\1\uffff\1\5\2\4\4\uffff\1\4\2\uffff\1\4\6\uffff\1\4\11"+
            "\uffff\1\4\5\uffff\1\4\5\uffff\2\4\5\uffff\3\4"
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "4398:1: (this_ProtocolReference_0= ruleProtocolReference | this_ProtocolDeclaration_1= ruleProtocolDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleTopLevelElement_in_entryRuleTopLevelElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleTopLevelElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleTopLevelElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_ruleQualifiedNameWithWildcard448 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildcard467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageName_in_entryRulePackageName510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageName521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageName567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName663 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName697 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePackage791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePackageName_in_rulePackage812 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleVersionString_in_rulePackage833 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePackage846 = new BitSet(new long[]{0xE0C1040102420000L});
    public static final BitSet FOLLOW_rulePackageElement_in_rulePackage867 = new BitSet(new long[]{0xE0C1040102430000L});
    public static final BitSet FOLLOW_16_in_rulePackage880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionString_in_entryRuleVersionString916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionString926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwoPartVersionString_in_ruleVersionString973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFourPartVersionString_in_ruleVersionString1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwoPartVersionString_in_entryRuleTwoPartVersionString1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTwoPartVersionString1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTwoPartVersionString1087 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTwoPartVersionString1104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTwoPartVersionString1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFourPartVersionString_in_entryRuleFourPartVersionString1162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFourPartVersionString1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwoPartVersionString_in_ruleFourPartVersionString1219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFourPartVersionString1236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFourPartVersionString1260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFourPartVersionString1277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFourPartVersionString1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageElement_in_entryRulePackageElement1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageElement1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartner_in_rulePackageElement1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rulePackageElement1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rulePackageElement1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflow_in_rulePackageElement1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rulePackageElement1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_rulePackageElement1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartner_in_entryRulePartner1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartner1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePartner1610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePartner1627 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePartner1644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePartner1656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePartner1668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartner1691 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePartner1704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePartner1727 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_rulePartner1741 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePartner1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleProcess1836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcess1853 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleProcess1870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProcessRole_in_ruleProcess1891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleProcess1904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProcessRole_in_ruleProcess1925 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleProcess1939 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProcess1951 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProcess1963 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleProcess1980 = new BitSet(new long[]{0x0000000021010000L});
    public static final BitSet FOLLOW_rulePreconditions_in_ruleProcess2006 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_rulePostconditions_in_ruleProcess2028 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProcess2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessRole_in_entryRuleProcessRole2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessRole2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleProcessRole2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreconditions_in_entryRulePreconditions2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreconditions2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePreconditions2305 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePreconditions2317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePreconditions2340 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePreconditions2353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePreconditions2376 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_rulePreconditions2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleEntity2473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEntity2507 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleEntityState_in_ruleEntity2528 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleEntity2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityState_in_entryRuleEntityState2577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityState2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEntityState2624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityState2641 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleEntityState2659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntityStateTransition_in_ruleEntityState2680 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleEntityState2693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEntityStateTransition_in_ruleEntityState2714 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleEntityState2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityStateTransition_in_entryRuleEntityStateTransition2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityStateTransition2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityStateTransition2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostconditions_in_entryRulePostconditions2855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostconditions2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePostconditions2902 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePostconditions2923 = new BitSet(new long[]{0x00000000C0010000L});
    public static final BitSet FOLLOW_ruleOnProcessSuccess_in_rulePostconditions2944 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_ruleOnProcessFailure_in_rulePostconditions2966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePostconditions2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnProcessSuccess_in_entryRuleOnProcessSuccess3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnProcessSuccess3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOnProcessSuccess3064 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOnProcessSuccess3076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOnProcessSuccess3099 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleOnProcessSuccess3112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOnProcessSuccess3135 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleOnProcessSuccess3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnProcessFailure_in_entryRuleOnProcessFailure3185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnProcessFailure3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOnProcessFailure3232 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOnProcessFailure3244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOnProcessFailure3267 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_20_in_ruleOnProcessFailure3280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleOnProcessFailure3303 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_28_in_ruleOnProcessFailure3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflow_in_entryRuleWorkflow3353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflow3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleWorkflow3400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkflow3417 = new BitSet(new long[]{0x0000000A00080000L});
    public static final BitSet FOLLOW_33_in_ruleWorkflow3435 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowVariant_in_ruleWorkflow3456 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkflow3469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowVariant_in_ruleWorkflow3490 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleWorkflow3504 = new BitSet(new long[]{0x0000000A00080000L});
    public static final BitSet FOLLOW_ruleWorkflowRoles_in_ruleWorkflow3527 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleWorkflowBlock_in_ruleWorkflow3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowVariant_in_entryRuleWorkflowVariant3584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowVariant3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkflowVariant3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRoles_in_entryRuleWorkflowRoles3675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRoles3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleDeclarations_in_ruleWorkflowRoles3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessReference_in_ruleWorkflowRoles3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleDeclarations_in_entryRuleRoleDeclarations3794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleDeclarations3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRoleDeclarations3841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowRole_in_ruleRoleDeclarations3862 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRoleDeclarations3875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowRole_in_ruleRoleDeclarations3896 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleRoleDeclarations3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRole_in_entryRuleWorkflowRole3946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRole3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_ruleWorkflowRole4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessReference_in_entryRuleProcessReference4036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessReference4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleProcessReference4083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProcessReference4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowBlock_in_entryRuleWorkflowBlock4142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowBlock4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleWorkflowBlock4189 = new BitSet(new long[]{0x00000051C0000000L});
    public static final BitSet FOLLOW_ruleWorkflowElement_in_ruleWorkflowBlock4210 = new BitSet(new long[]{0x00000051C0000000L});
    public static final BitSet FOLLOW_ruleEndPoint_in_ruleWorkflowBlock4232 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWorkflowBlock4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndPoint_in_entryRuleEndPoint4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndPoint4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEndPoint4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEndPoint4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowElement_in_entryRuleWorkflowElement4419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowElement4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowBranch_in_ruleWorkflowElement4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowAction_in_ruleWorkflowElement4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowBranch_in_entryRuleWorkflowBranch4538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowBranch4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleWorkflowBranch4585 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWorkflowBranch4597 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleBranchCondition_in_ruleWorkflowBranch4618 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_16_in_ruleWorkflowBranch4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchCondition_in_entryRuleBranchCondition4667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchCondition4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBranchCondition4714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBranchCondition4726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleBranchCondition4742 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBranchCondition4753 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleWorkflowBlock_in_ruleBranchCondition4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression4811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBooleanExpression4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowAction_in_entryRuleWorkflowAction4905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowAction4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionCall_in_ruleWorkflowAction4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowCall_in_ruleWorkflowAction4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionCall_in_entryRuleTransactionCall5024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionCall5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTransactionCall5071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransactionCall5094 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_ruleTransactionCall5107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariantMapping_in_ruleTransactionCall5128 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleTransactionCall5141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariantMapping_in_ruleTransactionCall5162 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleTransactionCall5176 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransactionCall5190 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleSenderRoleMapping_in_ruleTransactionCall5211 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransactionCall5223 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleReceiverRoleMapping_in_ruleTransactionCall5244 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransactionCall5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionVariantMapping_in_entryRuleTransactionVariantMapping5292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionVariantMapping5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransactionVariantMapping5350 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTransactionVariantMapping5362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransactionVariantMapping5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSenderRoleMapping_in_entryRuleSenderRoleMapping5418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSenderRoleMapping5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSenderRoleMapping5471 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSenderRoleMapping5496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSenderRoleMapping5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReceiverRoleMapping_in_entryRuleReceiverRoleMapping5552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReceiverRoleMapping5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleReceiverRoleMapping5605 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleReceiverRoleMapping5630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReceiverRoleMapping5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowCall_in_entryRuleWorkflowCall5686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowCall5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleWorkflowCall5733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWorkflowCall5756 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_ruleWorkflowCall5769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowVariantMapping_in_ruleWorkflowCall5790 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowCall5803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowVariantMapping_in_ruleWorkflowCall5824 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleWorkflowCall5838 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleWorkflowCall5852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowRoleMapping_in_ruleWorkflowCall5873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkflowCall5886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkflowRoleMapping_in_ruleWorkflowCall5907 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleWorkflowCall5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowVariantMapping_in_entryRuleWorkflowVariantMapping5957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowVariantMapping5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWorkflowVariantMapping6015 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkflowVariantMapping6027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkflowVariantMapping6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkflowRoleMapping_in_entryRuleWorkflowRoleMapping6083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkflowRoleMapping6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWorkflowRoleMapping6141 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWorkflowRoleMapping6153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWorkflowRoleMapping6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction6214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction6224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformTransaction_in_ruleTransaction6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotifyTransaction_in_ruleTransaction6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestTransaction_in_ruleTransaction6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInformTransaction_in_entryRuleInformTransaction6360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInformTransaction6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInformTransaction6413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInformTransaction6443 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33_in_ruleInformTransaction6461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_ruleInformTransaction6482 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleInformTransaction6495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_ruleInformTransaction6516 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleInformTransaction6530 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInformTransaction6544 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleInformTransaction6556 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleDatagramAction_in_ruleInformTransaction6577 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_rulePostconditions_in_ruleInformTransaction6598 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInformTransaction6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_entryRuleTransactionVariant6647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransactionVariant6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransactionVariant6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatagramAction_in_entryRuleDatagramAction6738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatagramAction6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDatagramAction6794 = new BitSet(new long[]{0x0000300000010000L});
    public static final BitSet FOLLOW_ruleVariantMessageMappings_in_ruleDatagramAction6815 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_ruleRequiredFeatures_in_ruleDatagramAction6837 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDatagramAction6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariantMessageMappings_in_entryRuleVariantMessageMappings6886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariantMessageMappings6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleVariantMessageMappings6933 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVariantMessageMappings6945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariantMessageMapping_in_ruleVariantMessageMappings6966 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleVariantMessageMappings6979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariantMessageMapping_in_ruleVariantMessageMappings7000 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleVariantMessageMappings7014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariantMessageMapping_in_entryRuleVariantMessageMapping7050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariantMessageMapping7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariantMessageMapping7105 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVariantMessageMapping7117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageMapping_in_ruleVariantMessageMapping7138 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleVariantMessageMapping7151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageMapping_in_ruleVariantMessageMapping7172 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleVariantMessageMapping7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageMapping_in_entryRuleMessageMapping7222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageMapping7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageName_in_ruleMessageMapping7278 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMessageMapping7290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageName_in_ruleMessageMapping7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageName_in_entryRuleMessageName7348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageName7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageName7405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredFeatures_in_entryRuleRequiredFeatures7449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredFeatures7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRequiredFeatures7496 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRequiredFeatures7508 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleRequiredFeatures7529 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleRequiredFeatures7542 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleRequiredFeature_in_ruleRequiredFeatures7563 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequiredFeatures7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredFeature_in_entryRuleRequiredFeature7613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredFeature7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorizationFeature_in_ruleRequiredFeature7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonRepudiationFeature_in_ruleRequiredFeature7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorizationFeature_in_entryRuleAuthorizationFeature7732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthorizationFeature7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAuthorizationFeature7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonRepudiationFeature_in_entryRuleNonRepudiationFeature7832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonRepudiationFeature7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNonRepudiationFeature7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotifyTransaction_in_entryRuleNotifyTransaction7932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotifyTransaction7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNotifyTransaction7985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNotifyTransaction8015 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33_in_ruleNotifyTransaction8033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_ruleNotifyTransaction8054 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleNotifyTransaction8067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_ruleNotifyTransaction8088 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleNotifyTransaction8102 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleNotifyTransaction8116 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNotifyTransaction8128 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOneWayAction_in_ruleNotifyTransaction8149 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_rulePostconditions_in_ruleNotifyTransaction8170 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleNotifyTransaction8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayAction_in_entryRuleOneWayAction8219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayAction8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleOneWayAction8266 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_ruleVariantMessageMappings_in_ruleOneWayAction8287 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_ruleRequiredFeatures_in_ruleOneWayAction8309 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_ruleOneWayTimeOuts_in_ruleOneWayAction8331 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleOneWayAction8343 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOneWayAction8355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOneWayAction8372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOneWayAction8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayTimeOuts_in_entryRuleOneWayTimeOuts8425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayTimeOuts8435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOneWayTimeOuts8472 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOneWayTimeOuts8484 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleOneWayTimeOut_in_ruleOneWayTimeOuts8505 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleOneWayTimeOuts8518 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_ruleOneWayTimeOut_in_ruleOneWayTimeOuts8539 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleOneWayTimeOuts8553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayTimeOut_in_entryRuleOneWayTimeOut8589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneWayTimeOut8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReceiptAckTimeOut_in_ruleOneWayTimeOut8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationAckTimeOut_in_ruleOneWayTimeOut8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReceiptAckTimeOut_in_entryRuleReceiptAckTimeOut8708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReceiptAckTimeOut8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleReceiptAckTimeOut8755 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleReceiptAckTimeOut8767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeOut_in_ruleReceiptAckTimeOut8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeOut_in_entryRuleTimeOut8824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeOut8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeOut8876 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleTimeOut8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationAckTimeOut_in_entryRuleValidationAckTimeOut8938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidationAckTimeOut8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleValidationAckTimeOut8985 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleValidationAckTimeOut8997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeOut_in_ruleValidationAckTimeOut9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequestTransaction_in_entryRuleRequestTransaction9054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestTransaction9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_ruleRequestTransaction9110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestTransaction9127 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33_in_ruleRequestTransaction9145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_ruleRequestTransaction9166 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleRequestTransaction9179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransactionVariant_in_ruleRequestTransaction9200 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleRequestTransaction9214 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRequestTransaction9228 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRequestTransaction9240 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleTwoWayAction_in_ruleRequestTransaction9261 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleRequestTransaction9273 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleOneWayAction_in_ruleRequestTransaction9294 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_rulePostconditions_in_ruleRequestTransaction9315 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRequestTransaction9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwoWayAction_in_entryRuleTwoWayAction9364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTwoWayAction9374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTwoWayAction9411 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_ruleVariantMessageMappings_in_ruleTwoWayAction9432 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_ruleRequiredFeatures_in_ruleTwoWayAction9454 = new BitSet(new long[]{0x0004300000000000L});
    public static final BitSet FOLLOW_ruleTwoWayTimeOuts_in_ruleTwoWayAction9476 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTwoWayAction9488 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTwoWayAction9500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTwoWayAction9517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTwoWayAction9534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwoWayTimeOuts_in_entryRuleTwoWayTimeOuts9570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTwoWayTimeOuts9580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTwoWayTimeOuts9617 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTwoWayTimeOuts9629 = new BitSet(new long[]{0x0058000000000000L});
    public static final BitSet FOLLOW_ruleTwoWayTimeOut_in_ruleTwoWayTimeOuts9650 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleTwoWayTimeOuts9664 = new BitSet(new long[]{0x0058000000000000L});
    public static final BitSet FOLLOW_ruleTwoWayTimeOut_in_ruleTwoWayTimeOuts9685 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleTwoWayTimeOuts9699 = new BitSet(new long[]{0x0058000000000000L});
    public static final BitSet FOLLOW_ruleTwoWayTimeOut_in_ruleTwoWayTimeOuts9720 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTwoWayTimeOuts9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTwoWayTimeOut_in_entryRuleTwoWayTimeOut9772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTwoWayTimeOut9782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneWayTimeOut_in_ruleTwoWayTimeOut9829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseTimeOut_in_ruleTwoWayTimeOut9856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResponseTimeOut_in_entryRuleResponseTimeOut9891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResponseTimeOut9901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleResponseTimeOut9938 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleResponseTimeOut9950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeOut_in_ruleResponseTimeOut9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol10007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol10017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolReference_in_ruleProtocol10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolDeclaration_in_ruleProtocol10091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolReference_in_entryRuleProtocolReference10126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolReference10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleProtocolReference10173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProtocolName_in_ruleProtocolReference10194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolName_in_entryRuleProtocolName10231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolName10242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProtocolName10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocolDeclaration_in_entryRuleProtocolDeclaration10332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocolDeclaration10342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleProtocolDeclaration10379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProtocolName_in_ruleProtocolDeclaration10400 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProtocolDeclaration10412 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleProtocolDeclaration10425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMessageName_in_ruleProtocolDeclaration10446 = new BitSet(new long[]{0x0100000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProtocolDeclaration10460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTimeUnit10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTimeUnit10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTimeUnit10544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTimeUnit10561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePattern10606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePattern10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePattern10640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePattern10657 = new BitSet(new long[]{0x0000000000000002L});

}