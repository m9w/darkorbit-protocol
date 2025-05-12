package com.darkorbit

interface AttributeSkillShieldUpdateCommand : ProtocolPacket {
	var maxSkinShieldTwinkle: Int
	var minSkinShieldTwinkle: Int
	var shieldSkillId: Int
}
