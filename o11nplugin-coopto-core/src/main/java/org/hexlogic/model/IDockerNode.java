/*	This file is part of project "Coopto", a computer software plugin for 		*
 *  utilizing Docker in VMware vRealize Orchestrator.							*
 *																				*
 *	Copyright (C) 2014-2015  Robert Szymczak	(rszymczak@fum.de)				*
 *																				*
 *																				*
 *	This program is free software: you can redistribute it and/or modify		*
 *	it under the terms of the GNU Lesser General Public License as published 	*
 *	by the Free Software Foundation, either version 3 of the License, or		*
 *	(at your option) any later version.											*
 *																				*
 *	This program is distributed in the hope that it will be useful,				*
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of				*
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  						*
 *	See the GNU Lesser General Public License for more details.					*
 *																				*
 *	You should have received a copy of the GNU Lesser General Public License	*
 *	along with this program.  If not, see <http://www.gnu.org/licenses/>.		*/
package org.hexlogic.model;

/* DockerNode interface to ensure upwards compatibility for IEndpointConfiguration services */
public interface IDockerNode
{
	public String getId();
	public void setId(String id);
	
	public String getDisplayName();
	public void setDisplayName(String displayName);
	
	public String getHostName();
	public void setHostName(String hostName);
	
	public int getHostPortNumber();
	public void setHostPortNumber(int portNumber);
	
	public String getDockerApiVersion();
	public void setDockerApiVersion(String apiVersion);
}