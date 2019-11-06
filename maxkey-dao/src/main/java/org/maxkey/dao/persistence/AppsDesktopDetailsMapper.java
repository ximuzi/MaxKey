/**
 * 
 */
package org.maxkey.dao.persistence;

import org.apache.mybatis.jpa.persistence.IJpaBaseMapper;
import org.maxkey.domain.apps.AppsDesktopDetails;

/**
 * @author Crystal.sea
 *
 */
public  interface AppsDesktopDetailsMapper extends IJpaBaseMapper<AppsDesktopDetails> {
	
	public  AppsDesktopDetails  getAppDetails(String id);
}
