package com.darkorbit

interface AttackLaserRunCommand : ProtocolPacket {
	var attackerId: Int
	var isDiminishedBySkillShield: Boolean
	var laserColor: Int
	var skilledLaser: Boolean
	var targetId: Int
	var visualType: Int
}
