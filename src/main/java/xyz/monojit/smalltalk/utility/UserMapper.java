/*
 * Twitter Backend - Moo: Twitter Clone Application Backend by Scaler
 * Copyright © 2021-2023 Subhrodip Mohanta (hello@subho.xyz)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package xyz.monojit.smalltalk.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import xyz.monojit.smalltalk.entity.Users;
import xyz.monojit.smalltalk.model.UserModel;

@Component("UserMapper")
public class UserMapper implements Mapper<Users, UserModel> {

  @Override
  public UserModel transform(Users user) {
    var userModel = new UserModel();
    BeanUtils.copyProperties(user, userModel);
    return userModel;
  }

  @Override
  public Users transformBack(UserModel userModel) {
    var user = new Users();
    BeanUtils.copyProperties(userModel, user, "followerCount", "followingCount", "verified");
    user.setFollowerCount(userModel.getFollowerCount() != null ? userModel.getFollowerCount() : 0L);
    user.setFollowingCount(
        userModel.getFollowingCount() != null ? userModel.getFollowingCount() : 0L);
    user.setVerified(userModel.getVerified() != null ? userModel.getVerified() : false);
    return user;
  }
}
