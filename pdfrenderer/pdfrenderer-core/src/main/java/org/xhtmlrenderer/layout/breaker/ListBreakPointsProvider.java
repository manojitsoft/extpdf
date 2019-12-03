/*
 * Copyright (C) 2017 Lukas Zaruba, lukas.zaruba@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */
package org.xhtmlrenderer.layout.breaker;

import java.util.Iterator;
import java.util.List;

/**
 * @author Lukas Zaruba, lukas.zaruba@gmail.com
 */
public class ListBreakPointsProvider implements BreakPointsProvider {
	
	private Iterator<BreakPoint> breakPoints;

	public ListBreakPointsProvider(List<BreakPoint> breakPoints) {
		this.breakPoints = breakPoints.iterator();
	}

	public BreakPoint next() {
		if (!breakPoints.hasNext()) return BreakPoint.getDonePoint();
		return breakPoints.next();
	}

}
