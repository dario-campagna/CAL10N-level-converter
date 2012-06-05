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

import ch.qos.cal10n.LocaleData;
import ch.qos.cal10n.Locale;
import ch.qos.cal10n.BaseName;

@BaseName("levels")
@LocaleData( { @Locale("en"), @Locale("it"), @Locale("ja") } )
public enum Levels {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR;
}
