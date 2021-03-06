package com.whopuppy.service;


import com.whopuppy.domain.chat.ChatRoom;
import com.whopuppy.domain.chat.ChatRoomMember;
import com.whopuppy.domain.criteria.ChatRoomCriteria;
import com.whopuppy.domain.user.User;
import org.springframework.web.socket.WebSocketSession;


import java.sql.Timestamp;
import java.util.List;

public interface ChatService {
    public ChatRoomMember findRoomUser(Long roomId, Long userId);
    public List<ChatRoom> findAllRoom();

    public ChatRoom findRoomById(Long roomId);

    public ChatRoom createRoom(ChatRoom chatRoom);

    public <T> void sendMessage(WebSocketSession session, T message);

    public boolean isBelong(String token);

    public boolean invite(Long chatRoomId, Long targetUserId);
    public boolean invite(User user, Long chatRoomId, Long targetUserId);

    //테스트용 나중에 지워
    public List<ChatRoomMember> test(Timestamp valueOf);
}
