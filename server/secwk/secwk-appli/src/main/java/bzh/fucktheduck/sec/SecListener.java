package bzh.fucktheduck.sec;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SecListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        stopContext();
    }

    private void stopContext() {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * javax.servlet.ServletContextListener#contextInitialized(javax.servlet.
     * ServletContextEvent)
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // initialise le contexte de l'application
        try {
            contextInitialized();
        } catch (Exception e) {
            // TODO : mettre un logger
        }
    }

    /**
     * @throws Exception
     *
     */
    public boolean contextInitialized() {
        return true;
    }

}
