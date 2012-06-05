/*
 *	Copyright 2012 Dario Campagna  
 *
 *	This file is part of CAL10N-level-converter.
 *
 *  CAL10N-level-converter is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CAL10N-level-converter is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with CAL10N-level-converter.  If not, see <http://www.gnu.org/licenses/>.
*/
	
import java.util.Locale;

import ch.qos.cal10n.IMessageConveyor;
import ch.qos.cal10n.MessageConveyor;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class CAL10NLevelConverter extends ClassicConverter {

    private static final String LOC_TRACE = localizeTRACE();
    private static final String LOC_DEBUG = localizeDEBUG();
    private static final String LOC_INFO  = localizeINFO();
    private static final String LOC_WARN  = localizeWARN();
    private static final String LOC_ERROR = localizeERROR();

    @Override
    public String convert(ILoggingEvent event) {
        Level level = event.getLevel();

        String locLevelName;

        switch (level.toInt()) {
            case Level.TRACE_INT:
                locLevelName = LOC_TRACE;
                break;
            case Level.DEBUG_INT:
                locLevelName = LOC_DEBUG;
                break;
            case Level.INFO_INT:
                locLevelName = LOC_INFO;
                break;
            case Level.WARN_INT:
                locLevelName = LOC_WARN;
                break;
            case Level.ERROR_INT:
                locLevelName = LOC_ERROR;
                break;
            default:
                locLevelName = LOC_DEBUG;
        }

        return locLevelName;
    }

    private static String localizeERROR() {
        IMessageConveyor mc = new MessageConveyor(Locale.getDefault());
        return mc.getMessage(Levels.ERROR);
    }

    private static String localizeWARN() {
        IMessageConveyor mc = new MessageConveyor(Locale.getDefault());
        return mc.getMessage(Levels.WARN);
    }

    private static String localizeINFO() {
        IMessageConveyor mc = new MessageConveyor(Locale.getDefault());
        return mc.getMessage(Levels.INFO);
    }

    private static String localizeDEBUG() {
        IMessageConveyor mc = new MessageConveyor(Locale.getDefault());
        return mc.getMessage(Levels.DEBUG);
    }

    private static String localizeTRACE() {
        IMessageConveyor mc = new MessageConveyor(Locale.getDefault());
        return mc.getMessage(Levels.TRACE);
    }

}
