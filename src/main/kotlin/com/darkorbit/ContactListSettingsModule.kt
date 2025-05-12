package com.darkorbit

interface ContactListSettingsModule : ProtocolPacket {
	var showBlacklistPlayers: Boolean
	var showClanMembers: Boolean
	var showFriends: Boolean
	var showRequests: Boolean
}
