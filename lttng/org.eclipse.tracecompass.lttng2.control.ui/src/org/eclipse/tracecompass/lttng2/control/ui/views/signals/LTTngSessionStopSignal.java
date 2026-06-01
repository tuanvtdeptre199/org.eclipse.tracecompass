package org.eclipse.tracecompass.lttng2.control.ui.views.signals;

import org.eclipse.tracecompass.tmf.core.signal.TmfSignal;

/**
 * Signal notify that the LTTng session have been stopped
 * @since 1.5
 */
public class LTTngSessionStopSignal extends TmfSignal{

    /**
     * Constructor
     * @param source input source
     */
    public LTTngSessionStopSignal(Object source) {
        super(source);
    }
}
