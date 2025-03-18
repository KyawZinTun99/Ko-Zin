package method;

class constructor {
    String subject;
    int duration;

    // Constructor
    constructor (String sub, int dur) {
        subject = sub;
        duration = dur;
    }

    void display() {
        System.out.println("Exam Subject: " + subject);
        System.out.println("Duration: " + duration + " minutes");
    }

    public static void main(String[] args) {
    	constructor  exam1 = new constructor ("Mathematics", 90);
        exam1.display();
    }
}

