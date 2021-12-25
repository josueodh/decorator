import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {

    @Test
    void sholdBeReturnTotal(){
        Notifier notifier = new DefaultNotifier(100);
        assertEquals(100, notifier.getTotal());
    }

    @Test
    void shouldBeReturnTotalWithSlack(){
        Notifier notifier = new Slack(new DefaultNotifier(100));
        assertEquals(250, notifier.getTotal());
    }

    @Test
    void shouldBeReturnTotalWithEmail(){
        Notifier notifier = new Email(new DefaultNotifier(100));
        assertEquals(200, notifier.getTotal());
    }

    @Test
    void shouldBeReturnTotalWithEmailAndSlack(){
        Notifier notifier = new Slack(new Email(new DefaultNotifier(100)));
        assertEquals(350, notifier.getTotal());
    }

    @Test
    void shouldBeReturnMethodW(){
        Notifier notifier = new DefaultNotifier();
        assertEquals("Default", notifier.getMethod());
    }
    @Test
    void shouldBeReturnMethodWithEmail(){
        Notifier notifier = new Email(new DefaultNotifier());
        assertEquals("Default/E-mail", notifier.getMethod());
    }
    @Test
    void shouldBeReturnMethodWithSlack(){
        Notifier notifier = new Slack(new DefaultNotifier());
        assertEquals("Default/Slack", notifier.getMethod());
    }

    @Test
    void shouldBeReturnMethodWithEmailAndSlack(){
        Notifier notifier = new Slack(new Email(new DefaultNotifier()));
        assertEquals("Default/E-mail/Slack", notifier.getMethod());
    }

}