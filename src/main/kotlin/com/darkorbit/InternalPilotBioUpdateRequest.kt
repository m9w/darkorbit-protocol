package com.darkorbit

interface InternalPilotBioUpdateRequest : ProtocolPacket {
	var age: Int
	var city: String
	var contact: String
	var country: String
	var day: Int
	var interest: String
	var month: Int
	var privacySettingsClan: PrivacySettingsType
	var privacySettingsEquipment: PrivacySettingsType
	var privacySettingsMessages: PrivacySettingsType
	var privacySettingsSkilltree: PrivacySettingsType
	var privacySettingsUserInfo: PrivacySettingsType
	var sex: String
	var userId: Long
	var year: Int
}
