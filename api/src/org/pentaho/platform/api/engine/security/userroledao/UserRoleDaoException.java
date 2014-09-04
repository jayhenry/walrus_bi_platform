/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.platform.api.engine.security.userroledao;

/**
 * Superclass of all exception types thrown by {@link IUserRoleDao} implementations.
 * 
 * @author mlowery
 */
public abstract class UserRoleDaoException extends RuntimeException {

  private static final long serialVersionUID = -80813880351536263L;

  public UserRoleDaoException( final String msg ) {
    super( msg );
  }

  public UserRoleDaoException( final String msg, final Throwable t ) {
    super( msg, t );
  }

}
