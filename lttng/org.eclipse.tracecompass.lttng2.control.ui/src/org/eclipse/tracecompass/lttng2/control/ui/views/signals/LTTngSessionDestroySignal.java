package org.eclipse.tracecompass.lttng2.control.ui.views.signals;

import org.eclipse.tracecompass.tmf.core.signal.TmfSignal;

/**
 * Signal notify that the LTTng session have been destroyed
 * @since 1.5
 */
public class LTTngSessionDestroySignal extends TmfSignal{

    private final String sessionName;

    /**
     * Constructor
     * @param source input source
     * @param sessionName LTTng session name
     */
    public LTTngSessionDestroySignal(Object source, String sessionName) {
        super(source);
        this.sessionName = sessionName;
    }

    /**
     * Get the name of the LTTng session
     * @return LTTng session name
     */
    public String getSessionName() {
        return sessionName;
    }
}
