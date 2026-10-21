public class Customer {
    private String customerId;
    private String name;
    private String mail;
    private double approvedBudget;

    public Customer(String idParam, String nameParam, String emailParam, double budgetParam) {
        customerId = idParam;
        name = nameParam;
        mail = emailParam;
        approvedBudget = budgetParam;
    }

    public String getCustomerId() { 
        return customerId; 
    }
    
    public String getName() { 
        return name; 
    }
    
    public double getApprovedBudget() { 
        return approvedBudget; 
    }

    public String getEmail() { 
        return mail; 
    }
}

