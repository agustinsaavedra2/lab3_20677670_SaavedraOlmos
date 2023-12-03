package CódigoFuente_20677670_SaavedraOlmos.Clases_20677670_SaavedraOlmos;

import java.util.List;

public class Option_20677670_SaavedraOlmos {
    private int code;
    private String message;
    private int chatbotCodeLink;
    private int initialFlowCodeLink;
    private List<String> keywords;

    public Option_20677670_SaavedraOlmos(int code, String message, int chatbotCodeLink,
                                         int initialFlowCodeLink, List<String> keywords) {
        this.code = code;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = keywords;
    }

    public int getCode() {
        return code;
    }
    
    public static List<Option_20677670_SaavedraOlmos> removeDuplicateOptions(List<Option_20677670_SaavedraOlmos> options){
    	List<Option_20677670_SaavedraOlmos> listOptions = new ArrayList<>();
    	List<Integer> codes = new ArrayList<>();
    	
    	for(Option_20677670_SaavedraOlmos op: options){
    	    if(!codes.contains(op.getCode())){
    	    	codes.add(op.getCode());
    	    	listOptions.add(op);
    	    }
    	}
    	
    	return listOptions;
    }

    @Override
    public String toString() {
        return "[" +
                code +
                message +
                chatbotCodeLink +
                initialFlowCodeLink +
                keywords +
                ']';
    }
}
