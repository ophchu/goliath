/*
* LivePerson copyrights will be here...
*/
package ophchu.couchbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author TLV\ophirc
 * @version 0.0.1
 * @since 10/25/12, 13:31
 */
public class Message {
  private static final Logger LOG = LoggerFactory.getLogger(Message.class);
  public String userId;
  public String message;
  public String type = "Message";
  public long date;

  public Message(String userId, String message) {
    super();
    this.userId = userId;
    this.message = message;
    date = System.currentTimeMillis();
  }
}
