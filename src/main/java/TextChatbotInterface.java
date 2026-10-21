public class TextChatbotInterface {
    public String processUserTextQuery(String textInput) {
        String response = "Processing text query: " + textInput;
        return response;
    }

    public String generateCarSuggestion(String userPreferences) {
        return "Based on your text input, we suggest looking at our SUV models.";
    }
}


