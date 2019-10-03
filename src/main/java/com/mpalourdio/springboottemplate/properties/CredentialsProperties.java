/*
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.mpalourdio.springboottemplate.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ImmutableConfigurationProperties;

@Getter
@AllArgsConstructor
@ImmutableConfigurationProperties("admin")
public class CredentialsProperties {

    private final String username;
    private final String password;
}
