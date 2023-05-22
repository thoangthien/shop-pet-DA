
package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.RoleDao;
import poly.store.entity.Role;
import poly.store.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {
	// Thong tin role dao
	@Autowired
	RoleDao roleDao;

	/**
	 * Tim kiem role theo id cua role
	 * 
	 * @param thong tin id cua role
	 * @return Role tim duoc
	 */
	@Override
	public Role findRoleById(int roleId) {
		return roleDao.findById(roleId).get();
	}
	
	/**
	 * Tim ten vai tro dua vao user id
	 * 
	 * @param thong tin user id
	 * @return danh sach ten vai tro tim duoc
	 */
	@Override
	public List<String> getRoleNames(int userId) {
		return roleDao.getRoleNames(userId);
	}

}
