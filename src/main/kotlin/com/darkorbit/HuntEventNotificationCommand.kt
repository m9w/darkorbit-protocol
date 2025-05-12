package com.darkorbit

interface HuntEventNotificationCommand : ProtocolPacket {
	var notificationType: NotificationType
}
