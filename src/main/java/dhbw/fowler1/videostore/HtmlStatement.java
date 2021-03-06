package dhbw.fowler1.videostore;

public class HtmlStatement extends Statement{
    String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

}
