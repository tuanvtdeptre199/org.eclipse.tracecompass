package org.eclipse.tracecompass.lttng2.control.ui.views.signals;

import org.eclipse.tracecompass.tmf.core.signal.TmfSignal;

/**
 * Signal notify that the External trace have been stopped
 * @since 1.5
 */
public class ExternalTraceStopSignal extends TmfSignal{

    private final String sessionName;

    /**
     * Constructor
     * @param source input source
     * @param sessionName external trace
     */
    public ExternalTraceStopSignal(Object source, String sessionName) {
        super(source);
        this.sessionName = sessionName;
    }

    /**
     * Get the name of the external trace
     * @return External trace name
     */
    public String getSessionName() {
        return sessionName;
    }
}
