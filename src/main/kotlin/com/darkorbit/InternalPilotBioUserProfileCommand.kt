package com.darkorbit

interface InternalPilotBioUserProfileCommand : ProtocolPacket {
	var EntryDate: String
	var age: Int
	var city: String
	var clanMemberCount: Int
	var clanName: String
	var clanRank: Int
	var contact: String
	var country: String
	var day: Int
	var interest: String
	var month: Int
	var playTime: Int
	var privacySettingsClan: PrivacySettingsType
	var privacySettingsEquipment: PrivacySettingsType
	var privacySettingsMessages: PrivacySettingsType
	var privacySettingsSkilltree: PrivacySettingsType
	var privacySettingsUserInfo: PrivacySettingsType
	var profileLikes: MutableList<Int>
	var profilePic: String
	var profilePicBlock: Int
	var profilePicDate: String
	var rank: Int
	var ranking: Int
	var registrationDate: String
	var result: Boolean
	var sex: String
	var statusMessage: String
	var uniqueProfileUrl: String
	var userId: Int
	var userName: String
	var userProfileId: Int
	var year: Int
}
